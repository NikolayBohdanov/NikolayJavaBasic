package homeWork7;

import java.util.Scanner;

public class Calculator {
    static void calculate(int a, int b, int c) {
        int f = a + b + c;
        double mid = (double) f / 3;
        System.out.println("Среднее арифметическое введеных чисел равно:");
        System.out.printf("%.2f", mid);
    }
    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа через пробел для получения среднего арифметического:");
        Scanner chislo = new Scanner(System.in);
        String chisla = chislo.nextLine();
        String[] subStr;
        String delimeter = " ";
        subStr = chisla.split(delimeter);
        int a = Integer.valueOf(subStr[0]);
        int b = Integer.valueOf(subStr[1]);
        int c = Integer.valueOf(subStr[2]);
        calculate(a, b, c);
        chislo.close();
    }
}