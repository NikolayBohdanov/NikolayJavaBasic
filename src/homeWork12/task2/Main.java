package homeWork12.task2;

//Задание 2
//Используя Intelij IDEA создать проект, пакет.
//Создать класс Animal с полями типа :(int) и (String).
//Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
//Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
public class Main {
    public static void main(String[] args) {
        Animal species1 = new Animal();
        Animal species2 = new Animal(10);
        Animal species3 = new Animal("Elephant", 10);
        System.out.println(species3.getSpecies());
        System.out.println(species3);
        System.out.println(species2);
        System.out.println(species2.getPopulation());
    }
}
