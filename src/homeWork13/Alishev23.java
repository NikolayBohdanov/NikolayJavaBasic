package homeWork13;

public class Alishev23 {
    public static void main(String[] args) {
//        String x = "hello";
//        x = x.toUpperCase();
//        System.out.println(x);
//        String string1 = "Hello";
//        String string2 = "my";
//        String string3 = "friend.";
//        String stringAll = string1+string2+string3;
//        System.out.println(stringAll);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend.");
//            sb.append(" friend."); можно сразу через точку вызывать этот метод подряд.
        System.out.println(sb.toString());
        // Продолжение
        System.out.print("Hello");
        System.out.println(" my friend.");
        System.out.printf("%s my %d %s friends.", "Hello", 3, "dear");
        System.out.printf("\nMy numder %-5d\n", 12);
        System.out.printf("My numder %5d\n", 1234);
        System.out.printf("My numder %-5d\n", 12345678);
        System.out.printf("My numder %5d\n", 1234567890);
        System.out.printf("My numder %.2f\n", 4.123920543);
        System.out.printf("My numder %.2f\n", 4.12392);
        System.out.printf("My numder %.4f\n", 4.12392250530645);
        System.out.printf("My numder %.2f\n", 4.0);
    }
}
