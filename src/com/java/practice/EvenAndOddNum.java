package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOddNum {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbers=list.stream().filter(f->f%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers "+evenNumbers);
        List<Integer> oddNumbers=list.stream().filter(f->f%2!=0).collect(Collectors.toList());
        System.out.println("Odd Numbers "+oddNumbers);
    }
}
