package Strategy;

import Strategy.Entities.General;
import Strategy.Entities.Man;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sort bubbleSort = new BubbleSort();
        Sort selectionSort = new SelectionSort();

        Sorter sorter = new Sorter(null);

        System.out.println("-".repeat(50));
        sorter.setAlgorithm(selectionSort);

        System.out.println("Selection (ArrayList)");
        sorter.sort(getArrayManList());

        System.out.println("Selection (LinkedList)");
        sorter.sort(getLinkedManList());


        System.out.println("-".repeat(50));
        sorter.setAlgorithm(bubbleSort);

        System.out.println("Bubble (ArrayList)");
        sorter.sort(getArrayManList());

        System.out.println("Bubble (LinkedList)");
        sorter.sort(getLinkedManList());

    }

    public static List<General> getArrayManList() {
        List<General> man = new ArrayList<>();
        man.add(new Man("Jim", 27));
        man.add(new Man("Stan", 66));
        man.add(new Man("John", 45));
        man.add(new Man("Sven", 25));
        man.add(new Man("Sam", 12));
        return man;
    }

    public static List<General> getLinkedManList() {
        List<General> man = new LinkedList<>();
        man.add(new Man("Jim", 27));
        man.add(new Man("Stan", 66));
        man.add(new Man("John", 45));
        man.add(new Man("Sven", 25));
        man.add(new Man("Sam", 12));
        return man;
    }
}
