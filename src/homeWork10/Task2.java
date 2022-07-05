package homeWork10;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[] feelings = {"anger", "awe", "joy", "love", "grief"};
        System.out.println("Please input random symbols:");
        Scanner symbols = new Scanner(System.in);
        String s = symbols.nextLine();
        char[] lettersConsol = s.toCharArray();
        System.out.println(Arrays.toString(lettersConsol));
        int[] a = getLetter(s);
        int count = 0;
        for (String word : feelings) {
            int[] wordFreq = getLetter(word);
            boolean ok = true;
            for (int i = 0; ok && i < a.length; i++) {
                if (wordFreq[i] > a[i]) {
                    ok = false;
                }
            }
            if (ok) {
                count++;
            }
        }
        System.out.println("You can make " + count + " feelings");
        symbols.close();
    }

    public static int[] getLetter(String word) {
        int[] a = new int[26];
        for (char c : word.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                a[c - 'a']++;
            }
        }
        return a;
    }
}
