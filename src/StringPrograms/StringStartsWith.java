package StringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringStartsWith {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("sumanth", "arun", "sai", "ashok", "madhu", "ravi", "srikanth");
//        List<String> string = list.stream().filter(name -> name.startsWith("s")).collect(Collectors.toList());
//        System.out.println(string);

        List<String> list=new ArrayList<>();

        for (int i=0;i<str.size();i++){
            char ch=str.get(i).charAt(0);
            if (ch=='s'){
                list.add(str.get(i));
            }
        }

        System.out.println(list);

    }
}
