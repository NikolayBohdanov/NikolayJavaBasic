package homeWork3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int a;
        double b;
        String name;
        Scanner x = new Scanner(System.in);
        System.out.println("Input your age (format - 98) weight( format- 83,9) Name (format - Nikolay)");
        if (x.hasNext()) {
            a = x.nextInt();
            b = x.nextDouble();
            name = x.next();
            System.out.println("Gathering together...");
            System.out.println("Receive your bio:");
            System.out.printf("My name is %1$s. My weight is %2$.1f. I'm %3$d years old.", name, b, a);
        } else System.out.println("Error.");
    }
}
