package ru.learning.action;

import ru.learning.character.Enemy;
import ru.learning.character.Player;

import java.util.Scanner;

public class FightAction extends Action {
    public FightAction() {
        actionText = "Для сражения с противником введите";
    }

    private static InnerFightAction[] typeOfAttack = {
            new AttackFightAction(),
            new BlockFightAction()
    };

    public void action() {
        Player batman = new Player("Бэтмен", 200, 20, 5);
        System.out.println("Герой: " + batman.getName());
        System.out.println("Здоровье: " + batman.getHealth());
        Enemy enemy1 = new Enemy("Бандит_1", 100, 10, 1);
        System.out.println("Враг: " + enemy1.getName());
        System.out.println("Здоровье: " + enemy1.getHealth());
        for (int active = 1; enemy1.isAlive() && batman.isAlive(); active++) {
            System.out.println();
            fightAction();
            Integer inputA = readConsoleInput();
            typeOfAttack[inputA - 1].fightAction(batman, enemy1, active);
            printStatus(batman, enemy1);
        }
        if (!enemy1.isAlive()) {
            System.out.println();
            System.out.println("Победа!");
            System.out.println();
        }
        else {
            System.out.println("Этому городу нужен новый герой...");
            System.out.println();
        }
    }

    private static void printStatus(Player batman, Enemy enemy1) {
        batman.printlnStatus();
        enemy1.printlnStatus();
    }

    public static void fightAction() {
        for (int i = 0; i < typeOfAttack.length; i++) {
            typeOfAttack[i].printlnFightAction(i + 1);
        }
    }

    public static Integer readConsoleInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}

