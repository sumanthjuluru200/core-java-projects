package practice;

import java.util.*;
import java.util.stream.Collectors;

public class DupString {

    public static void main(String[] args) {
        String inputString="aaaaahdsjffadsdjfasdjfksdja";

        LinkedList<Character> list=new LinkedList<>();

        char[] charArray=inputString.toCharArray();
        for (char c:charArray){
            list.add(c);

        }
        Set<Character> list2=list.stream().filter(f-> Collections.frequency(list,f)>1).collect(Collectors.toSet());
        System.out.println(list2);
    }
}
