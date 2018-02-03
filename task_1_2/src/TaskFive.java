public class TaskFive {

    public static final int N = 5;

    public static void main(String[] args) {
        int[][] array = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = i == j || i == (N - j - 1) ? 1 : 0;
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }
}
