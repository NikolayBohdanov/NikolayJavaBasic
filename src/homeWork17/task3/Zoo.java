package homeWork17.task3;
import java.util.ArrayList;
public class Zoo {
    public static void main(String[] args) {
        int i = 0;
        Animal panda = new Animal("Panda", "China");
        Animal elephant = new Animal("Elephant", "India");
        Animal monkey = new Animal("Monkey", "Chili");
        Animal parrot = new Animal("Parrot", "Ecuador");
        Animal puma = new Animal("Puma", "Brazil");
        Animal kangaroo = new Animal("Kangaroo", "Australia");
        Animal snake = new Animal("Anaconda", "Colombia");
        Animal penguin = new Animal("Penguin", "South Africa");

        ArrayList<Animal> listOfZooAnimals = new ArrayList<>();
        listOfZooAnimals.add(panda);
        listOfZooAnimals.add(elephant);
        listOfZooAnimals.add(monkey);
        listOfZooAnimals.add(parrot);
        listOfZooAnimals.add(puma);
        listOfZooAnimals.add(kangaroo);
        listOfZooAnimals.add(snake);
        listOfZooAnimals.add(penguin);
        while (i < listOfZooAnimals.size()) {
            System.out.println(listOfZooAnimals.get(i));
            i++;
        }
    }
}
