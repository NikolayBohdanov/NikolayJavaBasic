package homeWork17.alishev29;

public class Test {
    public static void main(String[] args) {
        //   Animal animal1 = new Animal();
        //   Dog dog1 = new Dog();
        //   animal1.eat();
        //   dog1.eat();
        //   Animal animal2 = new Dog();
        //   Dog dog2 = new Dog();
        //   //animal2.bark; так нельзя. доступен только метод eat
        //   animal2.eat();
        //   dog2.eat();
        //   dog2.bark();
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        test(animal);
        test(dog);
        test(cat);

    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
