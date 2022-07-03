package homeWork4;

import java.util.Scanner;

public class Alishev8 {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        System.out.println("Введите 5");
        int value;
        value = one.nextInt();
        while (value != 5) {
            System.out.println("Введите 5 ");
            value = one.nextInt();
        }
        System.out.println("Вы ввели 5");
        int value2;
        do {
            System.out.println("Введите 5");
            value2 = two.nextInt();

        } while (value2 != 5);
        System.out.println("Вы ввели 5. Спасибо. До свидания!");
    }
}
