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
}
