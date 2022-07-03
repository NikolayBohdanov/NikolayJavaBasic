package homeWork9;

import java.util.Scanner;

public class Posledovatelnost {
    public static void main(String[] args) {
        Scanner letters = new Scanner(System.in);
        System.out.println("Введите последовательность");
        String s = letters.nextLine();
        String[] howMany;

        String delimeter = "";
        howMany = s.split(delimeter);
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i < howMany.length; i++) {
            if (a < howMany.length) {
                if (b <= howMany.length) {
                    if (howMany[a].equals(howMany[b])) {
                        a++;
                        b++;
                    } else {
                        c = c + 1;
                        a++;
                        b++;
                    }
                }

            }
        }
        System.out.println("Обнаружено " + c + " последовательностей");
        letters.close();
    }
}
