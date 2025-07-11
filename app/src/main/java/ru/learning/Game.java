package ru.learning;

import ru.learning.action.*;

import java.util.Scanner;

public class Game {
    private static Action[] actions = {
            new RepeatAction(),
            new FightAction(),
            new RoomAction(),
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
}
