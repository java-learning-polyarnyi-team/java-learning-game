package ru.learning;

import ru.learning.action.*;
import ru.learning.character.Player;
import ru.learning.context.Context;
import ru.learning.room.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Game {
    private static Context context;

    private static List<Action> actions = new ArrayList<>() {{
            add(new NextRoomAction());
            add(new FightAction());
            add(new ExitAction());
    }};

    public static void main(String[] args) {
        Player player = makePlayer();
        List<Room> rooms = generateMap();
        context = new Context(rooms, player);
        while (true) {
            writeOptions();
            Integer input = readConsoleInput();
            actions.get(input - 1).action(context);
        }
    }

    public static Integer readConsoleInput() {
        Scanner input = new Scanner(System.in);
        Integer inputInt = input.nextInt();
        return inputInt;
    }

    public static void writeOptions() {
        List<Action> actionList = new ArrayList<>();
        for (int i = 0; i < actions.size(); i++) {
            if (actions.get(i).canBeAccept(context)) {
               actionList.add(actions.get(i));
            }
        }
        for (int i = 0; i < actionList.size(); i++) {
            actionList.get(i).printlnAction(i + 1);
        }
    }

    public static List<Room> generateMap() {
        RandomGenerator numberGenerator = RandomGenerator.getDefault();
        int roomNumber = numberGenerator.nextInt(5, 7);
        List<Room> roomList = new ArrayList<>();
        for (int i = 1; i <= roomNumber; i++) {
            int checkEnemy = numberGenerator.nextInt(0, 2);
            Room room = new Room("к", i, checkEnemy);
            roomList.add(room);
        }
        return roomList;
    }

    public static Player makePlayer() {
        System.out.println("Придумайте имя игрока:");
        Scanner inputName = new Scanner(System.in);
        String newName = inputName.nextLine();
        return new Player(newName, 200, 20, 5);
    }
}
