package homeWork5;

import java.util.Scanner;

public class Alishev10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время");
        int time = scanner.nextInt();
        String да = "Можете купить пиво";
        String нет = "Пиво после 18 не продаем";
        String закрыто = "Магазин не работает";
        switch (time) {
            case 9:
                System.out.println(да);
                break;
            case 10:
                System.out.println(да);
                break;
            case 11:
                System.out.println(да);
                break;
            case 12:
                System.out.println(да);
                break;
            case 13:
                System.out.println(да);
                break;
            case 14:
                System.out.println(да);
                break;
            case 15:
                System.out.println(да);
                break;
            case 16:
                System.out.println(да);
                break;
            case 17:
                System.out.println(да);
                break;
            case 18:
                System.out.println(да);
                break;
            case 19:
                System.out.println(нет);
                break;
            case 20:
                System.out.println(нет);
                break;
            case 21:
                System.out.println(нет);
                break;
            case 22:
                System.out.println(нет);
                break;
            default:
                System.out.println(закрыто);
        }

    }
}
