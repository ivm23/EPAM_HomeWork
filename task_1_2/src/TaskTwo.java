import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        double e;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите e :");
        e = in.nextDouble();

        int i = 1;
        double temp;

        do {
            temp =  1 / Math.pow(i + 1, 2);
            System.out.printf("%f ", temp);
            ++i;
        }
        while ( ! (temp < e));

        System.out.print("\nНаименьший номер элемента, для которого выполняется условие задачи: ");
        System.out.println(--i);
    }
}
