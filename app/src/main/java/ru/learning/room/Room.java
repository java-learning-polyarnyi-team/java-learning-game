package ru.learning.room;

public class Room {
    protected String roomText;
    private Integer number;

    public Room(String roomName, Integer number) {
        this.roomText = roomName;
        this.number = number;
    }

    public void printlnRoom(Integer number) {
        System.out.println(roomText + " " + number + ": ");
    }

    public void printlnCharacterRoom(String object, String location, Integer numberOfEnemies) {
        System.out.println("Месторасположение: " + object);
        System.out.println("Локация: " + location);
        System.out.println("Количество врагов: " + numberOfEnemies);
    }
}
