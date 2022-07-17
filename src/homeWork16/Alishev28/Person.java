package homeWork16.Alishev28;

public class Person {

//    private int d; // дает доступ только в пределах того класса, в котором мы этот модификатор доступа декларируем.

//    int c; //aka package visible, все, что default  доступно в перделах видимости пакета.

//    protected int b; //* дает доступ в пределах одного пакета плюс доступны всем подклассам, даже если эти подклассы вне пакета(наследников).

//    public int a; //дает доступ к классу, методу, полю везде внутри одного проекта.
    public String name1;
    String name2; // default

    private String name3;

    public final static String CONSTANT = "Constant";

    protected String name4;

    public Person() {
        name4 = "Bob";
    }
}
