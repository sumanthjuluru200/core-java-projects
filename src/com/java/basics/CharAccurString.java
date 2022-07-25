package com.java.basics;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharAccurString {

    static void frequency(String inputString){
        HashMap<Character,Integer> charCountMap=new HashMap<>();
        char[] charArray=inputString.toCharArray();
        for (char c:charArray){
            if (charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }
        charCountMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }

    public static void main(String[] args) {
        String inputString="welcome";
        frequency(inputString);
    }
}
