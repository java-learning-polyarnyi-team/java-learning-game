package ru.learning.room;

public class Room {
    private String roomText;
    private Integer roomNumber;
    private Integer enemyNumber;

    public Room(String roomName, Integer number, Integer enemyNumber) {
        this.roomText = roomName;
        this.roomNumber = number;
        this.enemyNumber = enemyNumber;
    }

    public void roomInfo() {
        String roomName = this.roomText + this.roomNumber;
        System.out.println(roomName);
    }
}
