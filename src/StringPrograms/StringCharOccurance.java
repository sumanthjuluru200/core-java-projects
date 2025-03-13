package StringPrograms;

import java.util.stream.Collectors;

public class StringCharOccurance {

    public static void main(String[] args) {
        String s1 = "AAAABBBCCD";


        String result=s1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.reducing(0,e->1,Integer::sum)))
                .entrySet().stream().map(entry->entry.getKey()+String.valueOf(entry.getValue()))
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
