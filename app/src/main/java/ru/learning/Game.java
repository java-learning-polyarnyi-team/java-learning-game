package ru.learning;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        while (true) {
            Integer input = readConsoleInput();
            if (input == 1) {
                return;
            }
        }
    }

    public static Integer readConsoleInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Для выхода введите 1: ");
        Integer inputInt = input.nextInt(); // здесь идет считывание текста
        return inputInt;
    }
}
