package homeWork12.task4;

public class Student {
    private int id;
    private String name;
    private String date;
    private String email;
    private String Address;

    public Student() {
        this(10);
    }

    public Student(int id) {
        this(10, "Kolya");
        this.id = id;
    }

    public Student(int id, String name) {
        this(10, "kolya", "10.10.22");
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, String date) {
        this(10, "Kolya", "10.10.22", "Kolya@gmail.com");
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Student(int id, String name, String date, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", date='" + date + '\'' + ", email='" + email + '\'' + ", Address='" + Address + '\'' + '}';
    }
}
