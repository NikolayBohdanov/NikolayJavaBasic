package homeWork7;

import java.util.Scanner;

public class Arithmetics {
    static void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    static void sub(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }

    static void mul(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    static void div(int a, int b) {
        if (b == 0) {
            System.out.println("На НОЛЬ делить нельзя");
        } else {
            double c = (double) a / b;
            System.out.printf("%.3f", c);
        }
    }

    public static void main(String[] args) {
        Scanner chislo = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор v2.0");
        System.out.println("Пожалуйста введите целые числа и знак арифметической");
        System.out.println("операции, которую необходимо сделать.");
        System.out.println("В формате: число1(пробел) знак операции(- + / *)(пробел) число2");
        String s = chislo.nextLine();
        String[] subStr;
        String delimeter = " ";
        subStr = s.split(delimeter);
        int a = Integer.valueOf(subStr[0]);
        int b = Integer.valueOf(subStr[2]);
        String c = new String(subStr[1]);
        switch (c) {
            case "/":
                div(a, b);
                break;
            case "+":
                add(a, b);
                break;
            case "-":
                sub(a, b);
                break;
            case "*":
                mul(a, b);
                break;
            default:
                System.out.println("Неверный формат ввода");
        }
        chislo.close();
    }
}
