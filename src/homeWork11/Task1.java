package homeWork11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sides = new Scanner(System.in);
        System.out.println("Please, input side lengths of a rectangle:");
        System.out.println("Side a:");
        double a = sides.nextDouble();
        System.out.println("Side b:");
        double b = sides.nextDouble();
        System.out.println("Calculating....");
        Rectangle userRectangle = new Rectangle();
        System.out.println("The area of your rectangle is : " + userRectangle.areaCalculator(a, b) + " square meters.");
        System.out.println("Thr perimeter of your rectangle is : " + userRectangle.perimeterCalculator(a, b) + " meters.");

    }
}

class Rectangle {
    double side1;
    double side2;


    public double areaCalculator(double side1, double side2) {
        double area = side1 * side2;
        return area;
    }

    public double perimeterCalculator(double side1, double side2) {
        double perimeter = side1 + side2;
        return perimeter;
    }

}
