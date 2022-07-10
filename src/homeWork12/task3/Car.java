package homeWork12.task3;

//Задание 3
//Используя Intelij IDEA создать проект, пакет.
//(Заново!) Создать класс Car с полями год(int), скорость(double), вес(int) цвет(String).
//Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//Перегрузить конструкторы.
//Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.
public class Car {
    private String brand;
    private int age;
    private double velocity;
    private int mass;
    private String color;

    public Car() {
        this("Mersedes");
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int age) {
        this.brand = brand;
        this.age = age;
    }

    public Car(String brand, int age, double velocity) {
        this("BMW", 15, 180.0, 2000);
        this.brand = brand;
        this.age = age;
        this.velocity = velocity;
    }

    public Car(String brand, int age, double velocity, int mass) {
        this.brand = brand;
        this.age = age;
        this.velocity = velocity;
        this.mass = mass;
    }

    public Car(String brand, int age, double velocity, int mass, String color) {
        this.brand = brand;
        this.age = age;
        this.velocity = velocity;
        this.mass = mass;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", age=" + age + " years , velocity=" + velocity + "km/h , mass=" + mass + "kg , color='" + color + '\'' + '}';
    }
}
