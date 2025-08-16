package ru.learning.action;

import ru.learning.context.Context;

public abstract class Action {
    protected String actionText;

    public void printlnAction(Integer number) {
        System.out.println(actionText + " " + number + ": ");
    }

    public abstract Context action(Context context);

    public abstract Boolean canBeAccept(Context context);
}
