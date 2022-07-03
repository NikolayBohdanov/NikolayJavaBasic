package homeWork4;

public class Test {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        a = b | b | b;
        a = a|b|a;
        b = a|a;
        System.out.println(a + " " + b);
    }

}
