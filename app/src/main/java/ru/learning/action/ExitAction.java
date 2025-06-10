package ru.learning.action;

public class ExitAction extends Action {
    public ExitAction() {
        actionText = "Для выхода из игры введите";
    }

    public void action() {
        System.out.println("Поверь, испытывать страх - это нормально. Когда ты это осознаешь, то сможешь ему сопротивляться.");
    }
}
