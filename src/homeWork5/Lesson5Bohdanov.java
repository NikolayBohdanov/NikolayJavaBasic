package homeWork5;

public class Lesson5Bohdanov {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        // метод 1 ______   !A & !B  =  !(A | B)
        System.out.println(!a&!b);
        System.out.println(!(a|b));
        System.out.println("Метод подтвержден !A & !B  =  !(A | B) ");
        // метод 2 ______   !A & B = !(A | !B)
        System.out.println(!a&b);
        System.out.println(!(a|!b));
        System.out.println("Метод подтвержден !A & B = !(A | !B) ");
        // метод 3 ______    A & !B = !(!A | B)
        System.out.println(a&!b);
        System.out.println(!(!a|b));
        System.out.println("Метод подтвержден A & !B = !(!A | B) ");
        // метод 4 ______    A & B = !(!A | !B)
        System.out.println(a&b);
        System.out.println(!(!a|!b));
        System.out.println("Метод подтвержден A & B = !(!A | !B) ");
        // метод 5 ______   !A | !B = !(A & B)
        System.out.println(!a|!b);
        System.out.println(!(a&b));
        System.out.println("Метод подтвержден !A | !B = !(A & B) ");
        // метод 6 ______   !A | B = !(A & !B)
        System.out.println(!a|b);
        System.out.println(!(a&!b));
        System.out.println("Метод подтвержден !A | B = !(A & !B) ");
        // метод 7 ______   A | !B = !(!A & B)
        System.out.println(a|!b);
        System.out.println(!(!a&b));
        System.out.println("Метод подтвержден A | !B = !(!A & B) ");
        // метод 8 ______   A | B = !(!A & !B)
        System.out.println(a|b);
        System.out.println(!(!a&!b));
        System.out.println("Метод подтвержден A | B = !(!A & !B) ");
    }

}
