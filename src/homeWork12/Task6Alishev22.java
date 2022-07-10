package homeWork12;
public class Task6Alishev22 {
    public static void main(String[] args) {
        Test test1 = new Test();
        System.out.println(test1.getConstant());
        final int X = 0;
        System.out.println(X);
        //X = 5;-no possible;
    }
}
class Test {
    public static final int CONSTANT = 10;

    public int getConstant() {
        return CONSTANT;
    }
}