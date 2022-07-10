package homeWork12;
public class Task6Alisev21 {
    public static void main(String[] args) {
        Man man1 = new Man("Lebovski", 40);
        Man man2 = new Man("Turkish", 35);
        Man.description = "Nice";
        man1.getAllFields();
        man2.getAllFields();
        Man.description = "Bad";
        man1.getAllFields();
        man2.getAllFields();
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.PI);
        man2.printNumOfPeoples();
        man1.printNumOfPeoples();
        Man man3 = new Man("Bobbie", 20);
        man3.printNumOfPeoples();
        man2.printNumOfPeoples();
    }
}
class Man {
    private String name;
    private int age;
    public static String description;
    public static int countPeople;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription() {
        System.out.println(description);
    }

    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description);
    }

    public void printNumOfPeoples() {
        System.out.println("Number of peoples is - " + countPeople);
    }
}

