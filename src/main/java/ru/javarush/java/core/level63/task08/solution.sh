#!/usr/bin/env bash
set -euo pipefail

# Скрипт выполняет полный "полетный тест":
# 1) Компилирует Java-приложение
# 2) Запускает его с включённым Java Flight Recorder на 30 секунд (profile)
# 3) Ждёт завершения приложения, после чего в каталоге появится файл test.jfr
# 4) Для проверки автоматически считает количество GC-событий через CLI-инструмент `jfr`
#    (в JMC вы должны найти то же число по событию jdk.GarbageCollection)

# Чистим возможные артефакты от предыдущих запусков
rm -f test.jfr Solution.class

# Шаг 1. Компиляция
javac Solution.java

# Шаг 2. Запуск с нужными параметрами JVM (ровно как в условии)
# -XX:StartFlightRecording=filename=test.jfr,duration=30s,settings=profile
# Небольшой размер кучи помогает спровоцировать GC-события.
echo "Запуск приложения... (запись JFR 30 секунд)"
java -Xms128m -Xmx128m -XX:StartFlightRecording=filename=test.jfr,duration=30s,settings=profile Solution

# Шаг 3. Проверяем, что файл записи создан
if [[ -f test.jfr ]]; then
  BYTES=$(wc -c < test.jfr)
  echo "Файл записи создан: test.jfr (${BYTES} байт)"
else
  echo "Ошибка: файл test.jfr не найден." >&2
  exit 1
fi

# Шаг 4. Считаем количество событий Garbage Collection в файле с помощью `jfr print`
# Каждый блок события 'jdk.GarbageCollection' — это один цикл сборки мусора.
GC_COUNT=$(jfr print --events jdk.GarbageCollection test.jfr | grep -c '^jdk\.GarbageCollection' || true)
echo "Точное количество GC-событий за 30 секунд: ${GC_COUNT}"

# Подсказка для ручной проверки в JMC (GUI):
# Откройте файл test.jfr в JDK Mission Control и найдите число событий jdk.GarbageCollection.
# В интерфейсе JMC это можно увидеть на вкладках, посвящённых GC/Events.