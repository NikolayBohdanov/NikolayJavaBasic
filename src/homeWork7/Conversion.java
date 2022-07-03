package homeWork7;
import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner valuta = new Scanner(System.in);
        System.out.println("Введите сумму валюты для конвертации:");
        int a = valuta.nextInt();
        System.out.println("Введите курс валюты c точностью до сотых:");
        double b = valuta.nextDouble();
        System.out.print("Вы получите: ");
        kurs(a, b);
    }
    static void kurs(int a, double b) {
        double c = (double) a * b;
        System.out.printf("%.1f", c);
    }
}

