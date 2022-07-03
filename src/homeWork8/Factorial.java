package homeWork8;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner chislo = new Scanner(System.in);
        System.out.println("Введите число для получения факториала");
        int a = chislo.nextInt();
        System.out.println(calculate(a));
        chislo.close();
    }

    public static int factorial = 1;

    private static int calculate(int a) {
        if (a == 0) {
            return 1;
        }
        if (a != 1) {
            factorial = factorial * a;
            a--;
            calculate(a);
        }
        return factorial;
    }
}
