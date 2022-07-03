package homeWork4;
//java.lang - уже импортированы
//java.util - нужно импортировать
import java.util.Scanner;
public class Alishev7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("Привет, введи какой-то текст");
        String text = s.nextLine();
        System.out.println("Спасибо за то, что вы ввели " + text + ".");
        System.out.println("Теперь введите какое-то число");
        int chislo = b.nextInt();
        System.out.println("Спасибо за то, что ввели " + chislo + ".");
        System.out.println("Вот так и прошли 20 минут моей жизни...");
    }
}
