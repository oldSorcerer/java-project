package level19.task14;

public class Solution {
    public static void main(String[] args) {
        // Создаем два сообщения с текстом "Привет!"
        Message email = new EmailMessage("Привет!");
        Message sms = new SmsMessage("Привет!");

        // Отправляем каждое сообщение — будут вызваны их переопределенные методы send()
        email.send();
        sms.send();
    }
}