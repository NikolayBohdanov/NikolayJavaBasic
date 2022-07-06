package homeWork10;
public class Task4Alishev17 {
    public static void main(String[] args) {
        Person person1 = new Person();
        String name1 = "Nikolay";
        int age1 = 20;
        person1.setNameAndAge(name1, age1);
        Person person2 = new Person();
        String name2 = "Lera";
        int age2 = 15;
        person2.setNameAndAge(name2, age2);
        person1.sayHelo();
        person1.speak();
        person2.sayHelo();
        person2.speak();
        person1.calculateAgeToRetirement();
        person2.calculateAgeToRetirement();
    }
}
class Person {
    int age;
    String name;

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

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

