package ru.learning.character;

import java.util.random.RandomGenerator;

public class Player extends Character {
    private Integer maxHealth;

    public Player(String name, Integer health) {
        super(name, health);
    }

    public Integer attack() {
        Integer attackPower1 = attackPower(20, 5);
        return attackPower1;
    }
}