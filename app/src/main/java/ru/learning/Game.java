package ru.learning;

import ru.learning.action.Action;
import ru.learning.action.ExitAction;
import ru.learning.action.FightAction;
import ru.learning.action.RepeatAction;

import java.util.Scanner;

public class Game {
    private static Action[] actions = {
            new RepeatAction(),
            new FightAction(),
            new ExitAction()
    };

    public static void main(String[] args) {
        while (true) {
            writeOptions();
            Integer input = readConsoleInput();
            Boolean exit = actions[input - 1].action();
            if (exit) {
                return;
            }
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
