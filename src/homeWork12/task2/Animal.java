package homeWork12.task2;

public class Animal {
    private int population;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    private String species;

    @Override
    public String toString() {
        return "Animal{" + "population=" + population + ", species='" + species + '\'' + '}';
    }

    public Animal() {
    }

    public Animal(int population) {
        this.population = population;
    }

    public Animal(String species, int population) {
        this.species = species;
        this.population = population;

    }

}
