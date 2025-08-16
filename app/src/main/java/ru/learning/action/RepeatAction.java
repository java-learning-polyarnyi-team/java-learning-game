package ru.learning.action;

import ru.learning.context.Context;

public class RepeatAction extends Action {
    public RepeatAction() {
        actionText = "Для повтора меню введите";
    }

    public Context action(Context context) {
        System.out.println("Ты выбрал следующий цикл");
        return context;
    }

    public Boolean canBeAccept(Context context) {
        return true;
    }
}
