package ru.learning;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        while (true) {
            writeOptions();
            Integer input = readConsoleInput();
            if (input == 1) {
                System.out.println("Ты выбрал следующий цикл, Меченый");
            }
            if (input == 2) {
                System.out.println("ВсеГо хороШеГо");
                return;
            }
        }
    }

    public static Integer readConsoleInput(){
        Scanner input = new Scanner(System.in);
        Integer inputInt = input.nextInt(); // здесь идет считывание текста
        return inputInt;
    }

    public static void writeOptions() {
        System.out.println("Для повтора введите 1: ");
        System.out.println("Для выхода введите 2: ");
    }
}
