package homeWork17;

public class Alishev30 {
    public static void main(String[] args) {
        byte a = 127;
        short b = a;
        short c = 128;
        byte d = (byte) c;
        System.out.println(c);
        System.out.println(d);
        int e = 123456;
        short f = (short) e;//явное приведение
        System.out.println(e);
        System.out.println(f);
        int g = a; //неявное приведение
    }
}
