package ru.learning.character;

import java.util.random.RandomGenerator;

public abstract class Character {
    private String name;
    private Integer health;
    protected Integer attackPower;
    private RandomGenerator randomAttackGenerator = RandomGenerator.getDefault();

    public Character(String name, Integer health) {
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

    public void takeDamage(int damage) {
        if (damage > 0) {
            health = health - damage;
            System.out.println(getName() + " получил урона: " + damage);
        }
    }

    public Integer attackPower(Integer attackPower, Integer minAttackPower) {
        this.attackPower = attackPower;
        int randomPower = randomAttackGenerator.nextInt(minAttackPower, attackPower + 1);
        return randomPower;
    }

    public void printlnStatus() {
        System.out.println("Здоровье " + getName() + ": " + getHealth());
    }

    public abstract Integer attack();
}
