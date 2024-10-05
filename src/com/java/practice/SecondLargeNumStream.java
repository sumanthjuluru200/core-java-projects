package com.java.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargeNumStream {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);

        Integer list2=list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(list2);
    }
}
