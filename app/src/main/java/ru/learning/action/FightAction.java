package ru.learning.action;

import ru.learning.character.Enemy;
import ru.learning.character.Player;

import java.util.Scanner;

public class FightAction extends Action {
    public FightAction() {
        actionText = "Для сражения с противником введите";
    }

    public Boolean action() {
        Player batman = new Player("Бэтмен", 200, 20, 5);
        System.out.println("Герой: " + batman.getName());
        System.out.println("Здоровье: " + batman.getHealth());
        Enemy enemy1 = new Enemy("Бандит_1", 100, 10, 1);
        System.out.println("Враг: " + enemy1.getName());
        System.out.println("Здоровье: " + enemy1.getHealth());
        for (int active = 1; (enemy1.isAlive() == true) && (batman.isAlive() == true); active++) {
            System.out.println();
            fightAction();
            Integer inputA = readConsoleInput();
            if (active % 2 != 0) {
                if (inputA == 1) {
                    enemy1.takeDamage(batman.attack());
                    if (enemy1.isAlive() == true) {
                        batman.printlnStatus();
                        enemy1.printlnStatus();
                    }
                }
                if (inputA == 2) {
                    System.out.println("Атака отражена");
                    System.out.println();
                    batman.printlnStatus();
                    enemy1.printlnStatus();
                }
            }
            else if (active % 2 == 0) {
                if (inputA == 1) {
                    enemy1.takeDamage(batman.attack());
                    batman.takeDamage(enemy1.attack());
                    if ((enemy1.isAlive() == true) && (batman.isAlive() == true)) {
                        batman.printlnStatus();
                        enemy1.printlnStatus();
                    }
                }
                if (inputA == 2) {
                    System.out.println("Атака отражена");
                    System.out.println();
                    batman.printlnStatus();
                    enemy1.printlnStatus();
                }
            }
        }
        if (enemy1.isAlive() == false) {
            System.out.println();
            System.out.println("Победа!");
            System.out.println();
        }
        else {
            System.out.println("Этому городу нужен новый герой...");
            System.out.println();
        }
        return false;
    }

    public static void fightAction() {
        System.out.println("Для атаки введите 1: ");
        System.out.println("Для защиты введите 2: ");
    }

    public static Integer readConsoleInput(){
        Scanner input = new Scanner(System.in);
        Integer inputInt = input.nextInt(); // здесь идет считывание текста
        return inputInt;
    }
}
