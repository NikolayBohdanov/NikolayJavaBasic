package homeWork7;

public class Alishev14 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 50;
        person1.name = "Никита";
        System.out.println("Привет, меня зовут " + person1.name + ". Мне " + person1.age + " лет.");
        Person person2 = new Person();
        person2.name = "Алина";
        person2.age = 20;
        System.out.println("Привет, меня зовут " + person2.name + ". Мне " + person2.age + " лет.");
    }
}
class Person {
    String name;
    int age;
}
