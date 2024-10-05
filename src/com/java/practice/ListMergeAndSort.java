package com.java.practice;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListMergeAndSort {

    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        List<Integer> list2= Arrays.asList(10,9,8,7,6);

        List<Integer> list3= Stream.concat(list1.stream(),list2.stream().sorted()).collect(Collectors.toList());
        System.out.println(list3);
    }
}
