package homeWork19;
public class Alishev31 {
    // Классы Обертки:  Double, Float, Long, Integer, Short, Byte, Character, Boolean.
    public static void main(String[] args) {
        Integer x = new Integer(235);
        Integer x2 = 1234;// упаковали в класс-оберту
        int x3 = x2;//Распаковали
        x2.intValue();
        System.out.println(x2.doubleValue());
        System.out.println(x2.compareTo(x));
        System.out.println(x2.compareTo(x3));
        System.out.println(x2.equals(x3));
        System.out.println(x2.toString());
        System.out.println(x2.byteValue());
        System.out.println(x2.getClass());
        final Boolean aFalse = Boolean.FALSE;// не очень понятно это
    }
}
