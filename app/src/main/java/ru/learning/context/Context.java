package ru.learning.context;

import ru.learning.room.Room;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private static List<Room> roomsStorage = new ArrayList<>();
    private static String makeName;

    public static void setRoomsStorage(Room room) {
        roomsStorage.add(room);
    }

    public static void setMakeName(String name) {
        makeName = name;
    }

    public static String getMakeName() {
        return makeName;
    }
}
