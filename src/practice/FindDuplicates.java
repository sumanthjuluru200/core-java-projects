package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {


        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 2, 4);
        Set<Integer> duplicates = arrayList.stream().filter(i -> Collections.frequency(arrayList, i) > 1).collect(Collectors.toSet());
        System.out.println(duplicates);

        Set<Integer> set=arrayList.stream().distinct().collect(Collectors.toSet());
        System.out.println(set);

    }
}
