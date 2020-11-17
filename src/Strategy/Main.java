package Strategy;

import Strategy.Entities.Man;
import Strategy.Entities.Orange;

public class Main {

    // TODO: сделать общий интерфейс для объектов, чтобы можно было сравнивать и сортировать разные классы
    public static void main(String[] args) {

        Sort bubbleSort = new BubbleSort();
        Sort selectionSort = new SelectionSort();

        Sorter sorter = new Sorter(null);

        System.out.println("Bubble");
        sorter.setAlgorithm(bubbleSort);

        sorter.sort(new Man[]{
            new Man("Jim", 27),
            new Man("Stan", 21),
            new Man("John", 25)
        });

        sorter.sort(new Orange[]{
            new Orange("3", true, 23),
            new Orange("1", false, 2.001),
            new Orange("2", true, 5.212),
            new Orange("5", true, 33),
            new Orange("4", false, 25)
        });

        System.out.println("-".repeat(50));

        System.out.println("Selection");
        sorter.setAlgorithm(selectionSort);
        sorter.sort(new Man[]{
            new Man("Jim", 27),
            new Man("Stan", 21),
            new Man("John", 25)
        });

        sorter.sort(new Orange[]{
            new Orange("3", true, 23),
            new Orange("1", false, 2.001),
            new Orange("2", true, 5.212),
            new Orange("5", true, 33),
            new Orange("4", false, 25)
        });
    }
}
