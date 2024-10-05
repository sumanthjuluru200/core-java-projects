package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNum {

    public static void main(String[] args) {

        List<Integer> arrayList= Arrays.asList(1,2,3,4,5,6,7,8);

        Integer secondLargeNum=arrayList.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargeNum);
    }
}
