import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        n = in.nextInt();
        double [] array = new double[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; ++i) {
            array[i] = in.nextDouble();
        }

        double max = array[0] + array[n-1];

        for (int i = 1; i < (n - 1) / 2; ++i) {
            if (array[i] + array[n - i - 1] < max) {
                max = array[i] + array[n - i - 1];
            }
        }

        System.out.print(max);
    }
}
