package homeWork11;

public class Task4Alishev20 {
    public static void main(String[] args) {
        Man man1 = new Man("Bob");
        Man man2 = new Man();
        Man man3 = new Man("Nik", 20);
    }
}

class Man {
    private String name;
    private int age;

    public Man() {
        this.age = 0;
        this.name = "some name";
        System.out.println("Hello from first constructor.");
    }

    public Man(String name) {
        System.out.println("Hello from second constructor.");
        this.name = name;
    }

    public Man(String name, int age) {
        System.out.println("Hello from third constructor.");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
