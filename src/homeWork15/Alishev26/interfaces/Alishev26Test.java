package homeWork15.Alishev26.interfaces;

public class Alishev26Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Nikki");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();
        Info info1 = new Animal(2);
        Info info2 = new Person("Bob");
//       info1.showInfo();
//       info2.showInfo();
        outPutInfo(info1);
        outPutInfo(info2);
        Animal animal3 = new Animal(3);
        Person person3 = new Person("Michael");
        outPutInfo(animal3);
        outPutInfo(person3);
    }

    public static void outPutInfo(Info info) {
        info.showInfo();
    }
}
