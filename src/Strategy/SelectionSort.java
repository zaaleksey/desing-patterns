package Strategy;

import Strategy.Entities.General;
import java.util.List;

public class SelectionSort implements Sort {

    @Override
    public void sort(List<General> list) {
        General temp = null;
        for (int left = 0; left < list.size(); left++) {
            int ind = left;
            for (int i = left; i < list.size(); i++) {
                if (list.get(i).criterion() < list.get(ind).criterion()) {
                    ind = i;
                }
            }

            temp = list.get(left);

            list.add(left, list.get(ind));
            list.remove(left + 1);

            list.add(ind, temp);
            list.remove(ind + 1);
        }

        System.out.println(list.toString());
    }
}
