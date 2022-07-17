package homeWork19.Alishev32;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //Up casting - Восходящее преобразование.
        Animal animal = dog;
       // animal.bark(); - нельзя.
        //Down casting - Нисходящее преобразование.
        Dog dog2 = (Dog) animal;
        dog2.bark(); // так  уже можно.
        Animal a = new Animal();
        Dog dog1 = (Dog) a;
        dog1.bark(); // - выдает ошибку.

    }
}
