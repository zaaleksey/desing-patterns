package Strategy;

import Strategy.Entities.General;
import java.util.Arrays;

public class SelectionSort implements Sort {

    @Override
    public void sort(General[] arr) {
        General temp = null;
        for (int left = 0; left < arr.length; left++) {
            int ind = left;
            for (int i = left; i < arr.length; i++) {
                if (arr[i].criterion() < arr[ind].criterion()) {
                    ind = i;
                }
            }
            temp = arr[left];
            arr[left] = arr[ind];
            arr[ind] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
