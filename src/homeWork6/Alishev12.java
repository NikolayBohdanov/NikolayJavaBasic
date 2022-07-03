package homeWork6;

public class Alishev12 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] stroka = new String[3];
        stroka[0] = "Привет";
        stroka[1] = "goodbye";
        stroka[2] = "java";
        System.out.println(stroka[0]);
        System.out.println(stroka[2]);
        for (int i = 0; i < stroka.length; i++) {
            System.out.println(stroka[i]);
        }
        System.out.println("цыкл for each:");
        for (String x : stroka) {
            System.out.println(stroka[0]);
            System.out.println(x);
        }
        int[] number = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int x : number) {
            sum = sum + x;
        }
        System.out.println();
        System.out.println(sum);
        // String s;    ==    String s = null;
    }
}
