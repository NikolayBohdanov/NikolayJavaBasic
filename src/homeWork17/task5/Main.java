package homeWork17.task5;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            integer.add(i);
        }
        System.out.println(integer);
        ListIterator<Integer> listIterator = integer.listIterator();
        while (listIterator.hasNext()) {
            integer.set(listIterator.nextIndex(), listIterator.next() + 1);
        }
        System.out.println(integer);
    }
}
