package homeWork7;

import java.util.Scanner;

public class NumbersChek {
    static String two(int a) {
        int c;
        c = a % 2;
        return "c остатком " + c;
    }

    static String five(int a) {
        int c;
        c = a % 5;
        return "c остатком " + c;
    }

    static String three(int a) {
        int c;
        c = a % 3;
        return "c остатком " + c;
    }

    static String six(int a) {
        int c;
        c = a % 6;
        return "c остатком " + c;
    }

    static String nine(int a) {
        int c;
        c = a % 9;
        return "c остатком " + c;
    }

    private static String primeOrNot(int a) {
        boolean isPrime = true;
        int temp;
        for (int i = 2; i <= a / 2; i++) {
            temp = a % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (a == 0) {
            return "ненатуральное";
        }
        if (isPrime) {
            return "простое";
        } else {
            return "составное";
        }
    }

    static String sign(int a) {
        if (a > 0) {
            return "положительное";
        }
        if (a < 0) {
            return "отрицательное";
        } else {
            return "Нуль (0) — ни положительное, ни отрицательное";
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите любое число:");
        Scanner chislo = new Scanner(System.in);
        int a = chislo.nextInt();
        System.out.println("Вы ввели " + sign(a) + " " + primeOrNot(a) + " число.");
        System.out.print("Это число делится:\nНа 2 " + two(a) + "\nНа 5 " + five(a) +
                "\nНа 3 " + three(a) + "\nНа 6 " + six(a) + "\nНа 9 " + nine(a));
    }
}
