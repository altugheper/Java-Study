package javapractice;

import java.util.ArrayList;
import java.util.List;

public class Karalama {
    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w : ages) {
            if (w==7) {
                continue;
            }
            w = w + 2;
            System.out.println(w);
        }


    }
}
