package homeWork10;

public class Task4Alishev18 {
    public static void main(String[] args) {
        Persona person1 = new Persona();
        person1.setName("Anton");
        person1.setAge(-1);
        System.out.println("Выводим значение имени в Main методе: " + person1.getName());
        System.out.println("Выводим значение возраста в Main методе: " + person1.getAge());

        person1.speak();
    }
}

class Persona {
    private String name;
    private int age;

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("Вы ввели пустое имя");
        } else
            name = username;
    }

    public String getName() {
        return name;
    }

    public void setAge(int userage) {
        if (userage < 0) {
            System.out.println("Возраст должен быть больше нуля.");
        } else
            age = userage;
    }


    public int getAge() {
        return age;
    }

    int calculateAgeToRetirement() {
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