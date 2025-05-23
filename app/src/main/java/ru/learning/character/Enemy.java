package ru.learning.character;

public class Enemy {
    public static String name;
    public static Integer health;
    public static Integer attackPower;

    public static boolean isAlive(Integer health) {
        if (health > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static Integer attack() {
        attackPower = 10;
        return attackPower;
    }

    public static Integer takeDamage(Integer health, Integer damage) {
        while (damage > 0) {
            health = health - damage;
        }
        return health;
    }
}
