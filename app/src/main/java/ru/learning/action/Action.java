package ru.learning.action;

public abstract class Action {
    protected String actionText;

    public void printlnAction(Integer number) {
        System.out.println(actionText + " " + number + ": ");
    }

    public abstract void action();
}
