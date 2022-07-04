package homeWork10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[] feelings = new String[]{"anger", "awe", "joy", "love", "grief"};
        Scanner letters = new Scanner(System.in);
        int howMany = 0;
        System.out.println("Please input random symbols:");
        String randomLetters = letters.nextLine();
        for (int i = 0; i < feelings.length; i++) {
            if (feelings[i].contentEquals(randomLetters)) {
                howMany++;
            }
        }
        System.out.println(randomLetters + "==" + howMany + "feelings");
    }
}

