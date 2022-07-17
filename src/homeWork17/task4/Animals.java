package homeWork17.task4;

public class Animals {
    private String name;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Animal description: name= " + name + ", country= " + country + ".";
    }

    public Animals(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
