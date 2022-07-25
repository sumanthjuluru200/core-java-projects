package BasicPrograms;

import java.util.*;

public class NumberAccur {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 4, 3, 2, 5, 2, 4, 5, 6, 5, 4);

        LinkedHashMap<Integer, Integer> mapCount = new LinkedHashMap<>();

        for (int c : numbers) {
            if (mapCount.containsKey(c)) {
                mapCount.put(c, mapCount.get(c) + 1);


            } else {
                mapCount.put(c, 1);
            }

        }
        System.out.println(mapCount);

    }
}
