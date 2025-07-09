package ru.learning.room;


public class IceRoom extends Room {
    public IceRoom() {
        roomText = "Для прохода в ледяную камеру введите";
    }

    public void characterRoom() {
        printlnCharacterRoom("Лечебница Аркхэм", "камера мистера Фризза", 1);
        System.out.println();
    }
}


