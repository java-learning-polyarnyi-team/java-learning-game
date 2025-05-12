package ru.learning;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        while (true) {
            Integer input = readConsoleInput();
            if (input == 2) {
                return;
            }
        }
    }

    public static Integer readConsoleInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Для повтора введите 1: ");
        System.out.println("Для выхода введите 2: ");
        Integer inputInt = input.nextInt(); // здесь идет считывание текста
        return inputInt;
    }
}
