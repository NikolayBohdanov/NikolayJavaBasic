package homeWork12.task4;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1);
        Student student2 = new Student(20);
        System.out.println(student2);
        System.out.println(student2.getId());
        Student student3 = new Student(30, "Vasya");
        System.out.println(student3);
        System.out.println(student3.getId() + " " + student3.getName());
        Student student4 = new Student(40, "Kostya", "12.11.2000");
        System.out.println(student4);
        System.out.println(student4.getId() + " " + student4.getName() + " " + student4.getDate());
        Student student5 = new Student(50, "Petya", "11.09.2001", "Petya@mail.com");
        System.out.println(student5);
        System.out.println(student5.getId() + " " + student5.getName() + " " + student5.getDate() + " " + student5.getEmail());
    }
}
