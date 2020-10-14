package Strategy;

import java.util.Arrays;

public class BubbleSort implements Sort {

    @Override
    public void sort(int[] arr) {
        boolean isSorted = false;
        int temp = 0;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
