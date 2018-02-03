import java.util.Scanner;

public class task_3 {

    static double F(double x) {
        return Math.tan(2*x) - 3;
    }

    public static void main(String[] args) {
        double a,b,h;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a:");
        a = in.nextDouble();
        System.out.println("Введите b:");
        b = in.nextDouble();
        System.out.println("Введите h:");
        h = in.nextDouble();

        while (a < b) {
            System.out.printf("%f %f \n", a, F(a));
            a += h;
        }
    }
}

