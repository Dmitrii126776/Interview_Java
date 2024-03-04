package reverseArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayUsingList {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "d"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        System.out.println(arrayList); // [a, b, c, d]

        Collections.reverse(arrayList);
        System.out.println(arrayList); // [d, c, b, a]

        String[] reversed = new String[arrayList.size()];
        arrayList.toArray(reversed);
        System.out.println(Arrays.toString(reversed)); // [d, c, b, a]
    }
}
