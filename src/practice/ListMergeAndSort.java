package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListMergeAndSort {

    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(0,1,2,4,3,5);
        List<Integer> list2=Arrays.asList(6,9,8,7,10);

        List<Integer> list3= Stream.concat(list1.stream(),list2.stream()).sorted().collect(Collectors.toList());
        List<Integer> list4=Stream.concat(list1.stream(),list2.stream().sorted()).collect(Collectors.toList());
        System.out.println(list3);
        System.out.println(list4);
    }
}
