package ru.learning.action;

import ru.learning.character.Enemy;
import ru.learning.character.Player;

public class BlockFightAction extends InnerFightAction {
    public BlockFightAction() {
        fightActionChoice = "Для защиты введите";
    }

    public void fightAction(Player player, Enemy enemy, Integer step) {
        System.out.println("Атака отражена");
        System.out.println();
    }
}
