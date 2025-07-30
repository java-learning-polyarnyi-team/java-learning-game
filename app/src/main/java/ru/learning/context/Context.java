package ru.learning.context;

import ru.learning.room.Room;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private List<Room> roomsStorage = new ArrayList<>();
    private String makeName;

    public Context(List<Room> room, String name) {
//        this.roomsStorage.add(room);
        this.roomsStorage = room;
        this.makeName = name;
    }
}
