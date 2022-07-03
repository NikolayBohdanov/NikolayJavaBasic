package homeWork4;

import java.util.Scanner;

public class ScannerDlyaChisla {
    public static void main(String[] args) {
        Scanner tekst = new Scanner(System.in);
        String s;
        String quit = "q";
        do {
            System.out.println("Введите ваше имя и возраст в формате: Николай 23 года. Для выхода введите - q");
            s = tekst.nextLine();
            System.out.println("Спасибо за ваши данные.");
        } while (!s.equals(quit));
        System.out.println("До свидания!.");
    }
}
