package ru.learning.room;

public class Room {
    protected String roomText;
    private Integer roomNumber;
    private Integer enemyNumber;

    public Room(String roomName, Integer number, Integer enemyNumber) {
        roomText = roomName;
        this.roomNumber = number;
        this.enemyNumber = enemyNumber;
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
