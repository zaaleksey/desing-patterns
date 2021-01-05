package Strategy;

import Strategy.Entities.General;
import java.util.List;

public class Sorter {

    private Sort algorithm = null;

    public Sorter(Sort algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(Sort algorithm) {
        this.algorithm = algorithm;
    }

    public void sort(List<General> list) {
        algorithm.sort(list);
    }
}
