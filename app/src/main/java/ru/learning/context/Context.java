package ru.learning.context;

import ru.learning.character.Player;
import ru.learning.room.Room;

import java.util.List;

public class Context {
    private List<Room> roomsStorage;
    private Player player;
    private Integer currentRoom;

    public Context(List<Room> room, Player player) {
        this.roomsStorage = room;
        this.player = player;
        currentRoom = 0;
    }

    public Player getPlayer() {
        return player;
    }

    public Integer nextRoom() {
        currentRoom++;
        return currentRoom;
    }

    public Room getCurrentRoom() {
        return roomsStorage.get(currentRoom);
    }

    public Integer getRoomsCount() {
        return roomsStorage.size();
    }
}
