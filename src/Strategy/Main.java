package Strategy;

public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 424, 13, 1, 132, 9, 42, 2, 6, 100};

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
        sorter.sort(new int[]{12, 424, 13, 1, 132, 9, 42, 2, 6, 100});
        System.out.println("Время сортировки: " + System.currentTimeMillis() + "ms");
    }

}
