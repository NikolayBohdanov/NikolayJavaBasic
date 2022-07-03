package homeWork8;

public class Alishev15_16 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 10;
        person1.name = "Nikita";
        person1.speak();
        Person person2 = new Person();
        person2.name = "Lera";
        person2.age = 11;
        person1.sayHelo();
        person2.sayHelo();
        person1.calculateAgeToRetirement();
        person2.calculateAgeToRetirement();
        int year1 = person1.calculatrAgeToRetirement();
        int year2 = person2.calculatrAgeToRetirement();
        System.out.println("Первому человеку до пении: " + year1 + " лет.");
        System.out.println("Второму человеку до пении: " + year2 + " лет.");
    }
}
class Person {
    int age;
    String name;

    void calculateAgeToRetirement() {
        int years = 65 - age;
        System.out.println("До пенсии осталось " + years + " лет.");
    }

    int calculatrAgeToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет. Пока!");
        }
    }

    void sayHelo() {
        System.out.println("Hello!");

    }
}

