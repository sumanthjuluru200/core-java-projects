package StringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateChar {

    static void duplicate(String inputString){
        List<Character> list=new ArrayList<>();
        char [] charArray=inputString.toCharArray();
        for (char c: charArray) {
            list.add(c);
        }

        Set<Character> set=list.stream().filter(f-> Collections.frequency(list,f)>1).collect(Collectors.toSet());
        System.out.println(set);
        List<Character> list1=list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
    }

    public static void main(String[] args) {
        String inputString="aaaabbbbccccddd";
        duplicate(inputString);
    }
}
