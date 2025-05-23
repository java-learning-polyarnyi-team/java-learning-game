package ru.learning.character;

public class Enemy {
    public String name;
    public Integer health;
    public Integer attackPower;

    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public Integer attack() {
        attackPower = 10;
        return attackPower;
    }

    public Integer takeDamage(int damage) {
        if (damage > 0) {
            health = health - damage;
        }
        return health;
    }
}
