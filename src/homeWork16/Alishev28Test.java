package homeWork16;

import homeWork16.Alishev28.Person;

public class Alishev28Test extends Person {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name1 = "Robin";
        Person person3 = new Person();
        //      person3.name2 = "Wilson"; // ошибка - нет доступа, так как name2 - default.
        person3.name1 = "Wilson"; // тут работает -> public.
        System.out.println(CONSTANT);
        //  Person person6 = new Person();
        //  System.out.println(person6.name4);
    }

    public Alishev28Test() {
        name4 = "Tom";
    }
}
