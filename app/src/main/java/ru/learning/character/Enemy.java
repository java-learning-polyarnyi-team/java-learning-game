package ru.learning.character;

public class Enemy {
    private String name;
    private Integer health;
    private Integer attackPower;

    public Enemy(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

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
