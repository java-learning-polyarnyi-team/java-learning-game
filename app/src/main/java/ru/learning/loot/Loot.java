package ru.learning.loot;

public class Loot {
    private String name;
    private String attackDamage;
    private Integer health;

    public Loot(String name, String attackDamage, Integer health) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.health = health;
    }
}
