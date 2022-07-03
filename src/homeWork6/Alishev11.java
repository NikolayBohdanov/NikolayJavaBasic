package homeWork6;

public class Alishev11 {
    public static void main(String[] args) {
        int number = 10;
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Пустая строка");
        int[] numbers2 = {1, 2, 3, 4, 5};
        for (int a = 0; a < numbers2.length; a++) {
            System.out.println(numbers2[a]);
        }
    }
}
