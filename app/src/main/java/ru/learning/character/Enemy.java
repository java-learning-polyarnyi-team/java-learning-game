package ru.learning.character;

import java.util.random.RandomGenerator;

public class Enemy {
    private String name;
    private Integer health;
    private Integer attackPower;
    private RandomGenerator randomQuantity = RandomGenerator.getDefault();

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
        int attackPower = randomQuantity.nextInt(1, 11);
        return attackPower;
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            health = health - damage;
            System.out.println(getName() + " получил урона: " + damage);
        }
    }

    public void printlnEnemyStatus() {
        System.out.println("Здоровье " + getName() + ": " + getHealth());
    }
}
