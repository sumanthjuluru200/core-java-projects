package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNums {

    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,2,5,6,4);
        Set<Integer> integerSet=integerList.stream().filter(f-> Collections.frequency(integerList,f)>1).collect(Collectors.toSet());
        System.out.println(integerSet);
    }
}
