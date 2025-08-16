package ru.learning.action;

import ru.learning.context.Context;

public class ExitAction extends Action {
    public ExitAction() {
        actionText = "Для выхода из игры введите";
    }

    public Context action(Context context) {
        System.out.println("Поверь, испытывать страх - это нормально. Когда ты это осознаешь, то сможешь ему сопротивляться.");
        System.exit(0);
        return context;
    }

    public Boolean canBeAccept(Context context) {
        return false;
    }
}
