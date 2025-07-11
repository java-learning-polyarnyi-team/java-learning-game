package ru.learning.character;

public class Player extends Character {
    private Integer maxHealth;

    public Player(String name, Integer health, Integer attackPower, Integer minAttackPower) {
        super(name, health, attackPower, minAttackPower);
    }
}