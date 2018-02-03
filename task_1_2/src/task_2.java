import java.util.Scanner;

public class task_2 {
    public static final int N = 10;

    public static void main(String[] args) {
        double e;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите e :");
        e = in.nextDouble();

        double [] array = new double[N + 1];
        int index = 0;

        for (int i = 1; i <= N; ++i) {
               array[i] = 1 / Math.pow(i + 1, 2);
               if (array[i] < e && index == 0) {
                   index  = i;
               }
        }

        System.out.println(index != 0 ? index : "не найдено!");

        for (int i = 1; i <= N; ++i) {
            System.out.printf("%f ", array[i]);
        }
    }
}
