package ru.learning.character;

import java.util.random.RandomGenerator;

public class Enemy extends Character {
        public Enemy(String name, Integer health) {
        super(name, health);
    }

    public Integer attack() {
        Integer attackPower1 = attackPower(10, 1);
        return attackPower1;
    }
}
