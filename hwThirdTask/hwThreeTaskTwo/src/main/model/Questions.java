package main.model;


import java.io.PrintStream;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Questions {
    private static void printQuestions(ResourceProperty bundle) {
        for (String key : bundle.keySet()) {
            System.out.println(bundle.getValue(key));
        }
    }

    public static void main(String[] args) {
        int answer = 0;
        while (answer != 1 && answer != 2) {
            System.out.print("Выберите язык/Choose language :\n");
            System.out.print("1 - Русский\n");
            System.out.print("2 - English\n");
            Scanner in = new Scanner(System.in);
            if (!in.hasNextInt()) {
                System.out.println("Введен неверный символ!/Enter the wrong symbol");
                continue;
            }
            answer = in.nextInt();

            if (answer == 1) {
                System.out.println("Вы выбрали русский");
                ResourceProperty myBundle = new ResourceProperty(new Locale("ru_RU"));
                printQuestions(myBundle);
            } else if (answer == 2) {
                System.out.println("You choose english");
                ResourceProperty myBundle = new ResourceProperty(new Locale("en_US"));
                printQuestions(myBundle);
            } else {
                System.out.println("Вы не выбрали язык!/You didn't choose language!");
            }
        }
    }

}

