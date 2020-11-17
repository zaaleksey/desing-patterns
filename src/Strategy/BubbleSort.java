package Strategy;

import Strategy.Entities.General;
import java.util.Arrays;

public class BubbleSort implements Sort {

    @Override
    public void sort(General[] arr) {
        boolean isSorted = false;
        General temp = null;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].criterion() > arr[i + 1].criterion()) {
                    isSorted = false;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
