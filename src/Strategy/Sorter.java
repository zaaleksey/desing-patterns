package Strategy;

public class Sorter {

    private Sort algorithm = null;

    public Sorter(Sort algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(Sort algorithm) {
        this.algorithm = algorithm;
    }

    public void sort(int[] arr) {
        algorithm.sort(arr);
    }
}
