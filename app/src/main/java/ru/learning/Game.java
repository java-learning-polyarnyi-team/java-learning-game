package ru.learning;

import ru.learning.character.Enemy;
import ru.learning.character.Player;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Player batman = new Player("Бэтмен", 200);
        while (true) {
            writeOptions();
            Integer input = readConsoleInput();
            if (input == 1) {
                System.out.println("Ты выбрал следующий цикл");
            }
            if (input == 2) {
                System.out.println("Герой: " + batman.getName());
                System.out.println("Здоровье: " + batman.getHealth());
                Enemy enemy1 = new Enemy("Бандит_1", 100);
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
                                batman.printlnPlayerStatus();
                                enemy1.printlnEnemyStatus();
                            }
                        }
                            if (inputA == 2) {
                                System.out.println("Атака отражена");
                                System.out.println();
                                batman.printlnPlayerStatus();
                                enemy1.printlnEnemyStatus();
                            }
                        }
                    else if (active % 2 == 0) {
                        if (inputA == 1) {
                            enemy1.takeDamage(batman.attack());
                            batman.takeDamage(enemy1.attack());
                            if ((enemy1.isAlive() == true) && (batman.isAlive() == true)) {
                                batman.printlnPlayerStatus();
                                enemy1.printlnEnemyStatus();
                            }
                        }
                        if (inputA == 2) {
                            System.out.println("Атака отражена");
                            System.out.println();
                            batman.printlnPlayerStatus();
                            enemy1.printlnEnemyStatus();
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
                }
            if (input == 3) {
                System.out.println("Поверь, испытывать страх - это нормально. Когда ты это осознаешь, то сможешь ему сопротивляться.");
                return;
            }
        }
    }

    public static Integer readConsoleInput(){
        Scanner input = new Scanner(System.in);
        Integer inputInt = input.nextInt(); // здесь идет считывание текста
        return inputInt;
    }

    public static void writeOptions() {
        System.out.println("Для повтора меню введите 1: ");
        System.out.println("Для сражения с противником введите 2: ");
        System.out.println("Для выхода из игры введите 3: ");
    }

    public static void fightAction() {
        System.out.println("Для атаки введите 1: ");
        System.out.println("Для защиты введите 2: ");
    }
}
