package Strategy;

import Strategy.Entities.General;
import java.util.List;

public class BubbleSort implements Sort {

    @Override
    public void sort(List<General> list) {
        boolean isSorted = false;
        General temp = null;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).criterion() > list.get(i + 1).criterion()) {
                    isSorted = false;

                    temp = list.get(i);

                    list.add(i, list.get(i + 1));
                    list.remove(i + 1);

                    list.add(i + 1, temp);
                    list.remove(i + 2);
                }
            }
        }

        System.out.println(list.toString());
    }
}
