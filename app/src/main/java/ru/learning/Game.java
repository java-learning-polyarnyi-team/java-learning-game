package ru.learning;

import ru.learning.action.*;
import ru.learning.context.Context;
import ru.learning.room.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Game {


    private static Action[] actions = {
            new FightAction(),
            new ExitAction()
    };

    public static void main(String[] args) {
        makePlayerName();
        generateMap();
        while (true) {
            writeOptions();
            Integer input = readConsoleInput();
            actions[input - 1].action();
        }
    }

    public static Integer readConsoleInput() {
        Scanner input = new Scanner(System.in);
        Integer inputInt = input.nextInt();
        return inputInt;
    }

    public static void writeOptions() {
        for (int i = 0; i < actions.length; i++) {
            actions[i].printlnAction(i + 1);
        }
    }

    public static List<Room> generateMap() {
        RandomGenerator numberGenerator = RandomGenerator.getDefault();
        int roomNumber = numberGenerator.nextInt(5, 7);
        List<Room> roomList = new ArrayList<>();
        System.out.println("Выберите комнату для перехода:");
        for (int i = 1; i <= roomNumber; i++) {
            int checkEnemy = numberGenerator.nextInt(0, 2);
            Room room = new Room("к", i, checkEnemy);
            roomList.add(room);
            room.roomInfo();
            Context.setRoomsStorage(room);
        }
        return roomList;
    }

    public static String makePlayerName() {
        System.out.println("Придумайте имя игрока:");
        Scanner inputName = new Scanner(System.in);
        String newName = inputName.nextLine();
        Context.setMakeName(newName);
        return newName;
    }
}
