package ru.learning.room;

public class EnigmaRoom extends Room {
    public EnigmaRoom() {
        roomText = "Для прохода в камеру Загадочника введите";
    }

    public void characterRoom() {
        printlnCharacterRoom("лечебница Аркхэм", "камера Загадочника", 1);
        System.out.println();
    }
}
