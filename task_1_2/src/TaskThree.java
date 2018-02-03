import java.util.Scanner;

public class TaskThree {

    static double f(double x) {
        return Math.tan(2*x) - 3;
    }

    public static void main(String[] args) {
        double a,b,h;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a:");
        a = in.nextDouble();

        System.out.println("Введите b:");
        b = in.nextDouble();

        while (b < a) {
            System.out.println("Значение b не корректно (b < a), введите b:");
            b = in.nextDouble();
        }

        System.out.println( "Введите h:");
        h = in.nextDouble();

        while (h <= 0) {
            System.out.println( "Значение шага должно быть положителным, введите h:");
            h = in.nextDouble();
        }

        while (a <= b) {
            System.out.printf("%f %f \n", a, f(a));
            a += h;
        }
    }
}

