package ru.learning.room;

public abstract class Room {
    protected String roomText;

    public void printlnRoom(Integer number) {
        System.out.println(roomText + " " + number + ": ");
    }

    public void printlnCharacterRoom(String object, String location, Integer numberOfEnemies) {
        System.out.println("Месторасположение: " + object);
        System.out.println("Локация: " + location);
        System.out.println("Количество врагов: " + numberOfEnemies);
    }

    public abstract void characterRoom();
}
