package ru.learning.action;

import ru.learning.context.Context;
import ru.learning.room.Room;

public class NextRoomAction extends Action {
    public NextRoomAction() {
        actionText = "Для перехода в следующую комнату введите: ";
    }

    public Context action(Context context) {
        Room currentRoom = context.getCurrentRoom();
        currentRoom.roomInfo();
        context.nextRoom();
        return context;
    }

    public Boolean canBeAccept(Context context) {
        if (context.nextRoom() == context.getRoomsCount()) {
            System.out.println("Победа!");
        }
        return false;
    }
}