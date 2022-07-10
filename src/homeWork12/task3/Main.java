package homeWork12.task3;
//Задание 3
//Используя Intelij IDEA создать проект, пакет.
//(Заново!) Создать класс Car с полями год(int), скорость(double), вес(int) цвет(String).
//Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//Перегрузить конструкторы.
//Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.
public class Main {
    public static void main(String[] args) {
        Car number1 = new Car();
        System.out.println(number1);
        Car number2 = new Car("Lada", 20, 100);
        System.out.println(number2);
        System.out.println(number2.getBrand());
        Car number3 = new Car("Tesla", 2, 200, 2000,"Black");
        System.out.println(number3);
        System.out.println(number3.getBrand());

    }
}
