import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        while (size <= 0) {
            System.out.println("Размер массива не может быть отрицательным, введите размер массива: ");
            size = in.nextInt();
        }
        int[][] array = new int[size][size];

        int n, m;
        System.out.println("Введите n:");
        n = in.nextInt();

        System.out.println("Введите m:");
        m = in.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                    if (i == j) {
                        array[i][j] = n;
                    }
                    else {
                        if (i == (size - j - 1)) {
                            array[i][j] = m;
                        }
                }

                if (size % 2 != 0) {
                        array[size / 2][size / 2] = 0;
                }
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }
}
