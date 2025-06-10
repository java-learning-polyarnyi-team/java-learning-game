package ru.learning.action;

public class RepeatAction extends Action {
    public RepeatAction() {
        actionText = "Для повтора меню введите";
    }

    public void action() {
        System.out.println("Ты выбрал следующий цикл");
    }
}
