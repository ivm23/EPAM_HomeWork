package main.model.java;


import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

public class Questions {

    private static void printQuestions(ResourceProperty bundle) {
        for (String key : bundle.keySet()) {
            int endIndex = bundle.getValue(key).indexOf('|');
            System.out.println(bundle.getValue(key).substring(0, endIndex));
        }
    }

    private static void printAnswer(ResourceProperty bundle, int indexOfAnswer) throws Exception {
        indexOfAnswer -= 1;
        if (indexOfAnswer > bundle.keySet().size()) {
            throw new Exception("Such question isn't exist");
        }
        String key = (bundle.keySet().toArray())[indexOfAnswer].toString();
        String value = bundle.getValue(key);
        int beginIndex = value.indexOf('|');
        System.out.println(value.substring(beginIndex + 1, value.length()));
    }

    public static void main(String[] args) {
        int answer = 0;
        ResourceProperty myBundle = new ResourceProperty(Locale.getDefault());

        Scanner in = new Scanner(System.in);

        while (answer != 1 && answer != 2) {
            System.out.print("Выберите язык/Choose language :\n");
            System.out.print("1 - Русский\n");
            System.out.print("2 - English\n");

            if (!in.hasNextInt()) {
                System.out.println("Введен неверный символ!/Enter the wrong symbol");
                continue;
            }
            answer = in.nextInt();

            if (answer == 1) {
                System.out.println("Вы выбрали русский. Для завершения введите \"Выход\"");
                myBundle = new ResourceProperty(new Locale("ru_RU"));
                printQuestions(myBundle);
            } else if (answer == 2) {
                System.out.println("You choose english. For the finish work enter \"Exit\"");
                myBundle = new ResourceProperty(new Locale("en_US"));
                printQuestions(myBundle);
            } else {
                System.out.println("Вы не выбрали язык!/You didn't choose language!");
            }
        }

        while (in.hasNext()) {
            if (in.hasNextInt()) {
                try {
                    printAnswer(myBundle, in.nextInt());
                } catch (Exception ex) {
                    System.out.println(answer == 1 ? "Такого вопроса не существует!" : "Such question isn't exist!");
                }
            } else if (answer == 2) {
                if (in.hasNext("Exit")) {
                    break;
                } else {
                    System.out.println("Incorrect symbol!");
                }
            } else if (answer == 1) {
                if (in.hasNext("Выход")) {
                    break;
                } else {
                    in.next();
                    System.out.println("Некорректный символ!");
                }
            }
        }

    }

}

