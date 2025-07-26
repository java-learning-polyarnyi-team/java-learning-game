package ru.learning.action;

import ru.learning.room.EnigmaRoom;
import ru.learning.room.ExitRoom;
import ru.learning.room.IceRoom;
import ru.learning.room.Room;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class RoomAction extends Action {

    public RoomAction() {
        actionText = "Для выбора следующей локации введите";
    }

    private static Room[] rooms = {
            new IceRoom(),
            new EnigmaRoom(),
            new ExitRoom()
    };

    public void action() {
        writeOptions();
        Integer input = readConsoleInput();
        rooms[input - 1].characterRoom();
    }

    public static Integer readConsoleInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void writeOptions() {
        for(int i = 0; i < rooms.length; i++) {
            rooms[i].printlnRoom(i + 1);
        }
    }
}
