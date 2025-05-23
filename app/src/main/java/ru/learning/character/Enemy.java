package ru.learning.character;

public class Enemy {
    private String name;
    private Integer health;
    private Integer attackPower;

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

    public void takeDamage(int damage) {
        if (damage > 0) {
            health = health - damage;
        }
    }
}
