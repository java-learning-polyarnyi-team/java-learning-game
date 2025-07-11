package ru.learning.action;

import ru.learning.character.Enemy;
import ru.learning.character.Player;

public abstract class InnerFightAction {
    protected String fightActionChoice;

    public void printlnFightAction(Integer number) {
        System.out.println(fightActionChoice + " " + number + ": ");
    }

    public abstract void fightAction(Player player, Enemy enemy, Integer step);
}
