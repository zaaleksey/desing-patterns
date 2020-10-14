package Strategy;

public class Main {

    // TODO: сделать общий интерфейс для объектов, чтобы можно было сравнивать и сортировать разные классы
    public static void main(String[] args) {

        Sort bubbleSort = new BubbleSort();
        Sort selectionSort = new SelectionSort();

        Sorter sorter = new Sorter(null);

        System.out.println("Bubble");
        sorter.setAlgorithm(bubbleSort);
        sortTimer(sorter);

        System.out.println("-".repeat(50));

        System.out.println("Selection");
        sorter.setAlgorithm(selectionSort);
        sortTimer(sorter);
    }

    public static void sortTimer(Sorter sorter) {
        long start = System.currentTimeMillis();
        sorter.sort(new int[]{12, 424, 13, 1, 132, 9, 42, 2, 6, 100, 11, 105, 353, 333, 14, 1010, 94});
        long total = System.currentTimeMillis() - start;
        System.out.println("Время сортировки: " + total + "ms");
    }

}
