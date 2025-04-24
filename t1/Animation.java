package t1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * This program pairs numbers with strings. Each number from the first list is associated with a string from the second list. The result is stored in a LinkedHashMap, which maintains the insertion order. The LinkedHashMap is a type of Map that preserves the order of elements based on their insertion sequence. Therefore, the integer works as an index for the string.
 * @author Alexia Ioana Cazan
 */

public class Animation {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(6, 1, 7, 3, 2, 5, 4, 10, 8, 9);
        List<String> list2 = List.of("hnn", "lyn", "gpe", "xnz", "aue", "hqk", "oln", "bmf", "oaf", "rpv", "kvg", "cgp");

        Map<Integer, String> resultMap = new LinkedHashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            resultMap.put(list1.get(i), list2.get(i));
        }

        System.out.println("Number - String Associations:");
        resultMap.forEach((num, str) -> 
            System.out.println(num + " - " + str)
        );
}
}
