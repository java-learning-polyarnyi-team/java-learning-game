package ru.learning;

import ru.learning.action.*;
import ru.learning.room.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Game {


    private static Action[] actions = {
//            new RepeatAction(),
            new FightAction(),
//            new RoomAction(),
            new ExitAction()
    };

    public static void main(String[] args) {
        while (true) {
            writeOptions();
            Integer input = readConsoleInput();
            actions[input - 1].action();
        }
    }

    public static Integer readConsoleInput() {
        Scanner input = new Scanner(System.in);
        Integer inputInt = input.nextInt(); // здесь идет считывание текста
        return inputInt;
    }

    public static void writeOptions() {
        for (int i = 0; i < actions.length; i++) {
            actions[i].printlnAction(i + 1);
        }
    }

    public static List<String> generateMap() {
        RandomGenerator numberGenerator = RandomGenerator.getDefault();
        int roomNumber = numberGenerator.nextInt(5, 7);
        List<String> roomName = new ArrayList<>();
        for (int i = 1; i <= roomNumber; i++) {
            Room rooms = new Room("k", i);
            roomName.add(rooms.toString());
        }
        int checkEnemy = numberGenerator.nextInt(0, 2);
        return roomName;
    }
}
