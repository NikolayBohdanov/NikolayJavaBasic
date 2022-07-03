package homeWork5;

public class Alishev9 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i >= 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        for (int a = 0; a <= 15; a++) {
            if (a % 2 == 0) {
                continue;
            }
            System.out.println("Это не четное число" + a);
        }
    }
}

