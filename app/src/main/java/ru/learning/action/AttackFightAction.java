package ru.learning.action;

import ru.learning.character.Enemy;
import ru.learning.character.Player;

public class AttackFightAction extends InnerFightAction {
    public AttackFightAction() {
        fightActionChoice = "Для атаки введите";
    }

    public void fightAction(Player player, Enemy enemy, Integer step) {
        if (step % 2 != 0) {
            enemy.takeDamage(player.attack());
        }
        else {
            enemy.takeDamage(player.attack());
            player.takeDamage(enemy.attack());
        }
    }
}
