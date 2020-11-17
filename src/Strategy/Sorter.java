package Strategy;

import Strategy.Entities.General;

public class Sorter {

    private Sort algorithm = null;

    public Sorter(Sort algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(Sort algorithm) {
        this.algorithm = algorithm;
    }

    public void sort(General[] arr) {
        algorithm.sort(arr);
    }
}
