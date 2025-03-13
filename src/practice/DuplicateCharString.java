package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCharString {

    static void duplicates(String inputString){
        List<Character> list=new ArrayList<>();

        char[] chr=inputString.toCharArray();
        for (char c: chr) {
            list.add(c);

        }

        list.stream().distinct().forEach(System.out::print);
        List<Character> list1=list.stream().distinct().collect(Collectors.toList());
        System.out.print(list1);
    }

    public static void main(String[] args) {
        String inputString="aaabbbcccddd";
        duplicates(inputString);
    }
}
