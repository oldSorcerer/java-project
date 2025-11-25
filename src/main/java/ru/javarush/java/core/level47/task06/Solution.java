package ru.javarush.java.core.level47.task06;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем фабрику и открываем поток к файлу sample.xml




        // После создания reader уже указывает на текущее событие (обычно START_DOCUMENT)
        // Идем по всем событиям до END_DOCUMENT включительно
        while (true) {
            int event = reader.getEventType();


            if (event == XMLStreamConstants.END_DOCUMENT) {

            }


        }



    }

    // Преобразуем числовой код события в человекочитаемое имя
    private static String eventName(int type) {
        switch (type) {
            case XMLStreamConstants.START_ELEMENT: return "START_ELEMENT";
            case XMLStreamConstants.END_ELEMENT: return "END_ELEMENT";
            case XMLStreamConstants.CHARACTERS: return "CHARACTERS";
            case XMLStreamConstants.CDATA: return "CDATA";
            case XMLStreamConstants.COMMENT: return "COMMENT";
            case XMLStreamConstants.SPACE: return "SPACE";
            case XMLStreamConstants.START_DOCUMENT: return "START_DOCUMENT";
            case XMLStreamConstants.END_DOCUMENT: return "END_DOCUMENT";
            case XMLStreamConstants.PROCESSING_INSTRUCTION: return "PROCESSING_INSTRUCTION";
            case XMLStreamConstants.ENTITY_REFERENCE: return "ENTITY_REFERENCE";
            case XMLStreamConstants.DTD: return "DTD";
            case XMLStreamConstants.ATTRIBUTE: return "ATTRIBUTE";
            case XMLStreamConstants.NAMESPACE: return "NAMESPACE";
            case XMLStreamConstants.NOTATION_DECLARATION: return "NOTATION_DECLARATION";
            case XMLStreamConstants.ENTITY_DECLARATION: return "ENTITY_DECLARATION";
            default: return "UNKNOWN(" + type + ")";
        }
    }
}