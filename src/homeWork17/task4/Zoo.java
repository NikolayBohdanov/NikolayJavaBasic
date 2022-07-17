package homeWork17.task4;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Animals panda = new Animals("Panda", "China");
        Animals elephant = new Animals("Elephant", "India");
        Animals monkey = new Animals("Monkey", "Chili");
        Animals parrot = new Animals("Parrot", "Ecuador");
        Animals puma = new Animals("Puma", "Brazil");
        Animals kangaroo = new Animals("Kangaroo", "Australia");
        Animals snake = new Animals("Anaconda", "Colombia");
        Animals penguin = new Animals("Penguin", "South Africa");

        ArrayList<Animals> listOfZooAnimals = new ArrayList<>();
        listOfZooAnimals.add(panda);
        listOfZooAnimals.add(elephant);
        listOfZooAnimals.add(monkey);
        listOfZooAnimals.add(parrot);
        listOfZooAnimals.add(puma);
        listOfZooAnimals.add(kangaroo);
        listOfZooAnimals.add(snake);
        listOfZooAnimals.add(penguin);
        for (int i = 0; i < listOfZooAnimals.size(); i++) {
            System.out.println(listOfZooAnimals.get(i));
        }
        System.out.println("Amount of animals in the Zoo: " + listOfZooAnimals.size() + ".");
        listOfZooAnimals.remove(monkey);
        listOfZooAnimals.remove(puma);
        listOfZooAnimals.remove(snake);
        for (int i = 0; i < listOfZooAnimals.size(); i++) {
            System.out.println(listOfZooAnimals.get(i));
        }
        System.out.println("Amount of animals in the Zoo: " + listOfZooAnimals.size() + ".");
    }
}
