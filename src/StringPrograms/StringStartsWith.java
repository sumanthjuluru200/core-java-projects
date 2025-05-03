package StringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartsWith {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("sumanth", "arun", "sai", "ashok", "madhu", "ravi", "srikanth");
        List<String> list = str.stream().filter(f -> f.toLowerCase().startsWith("s")).toList();
        System.out.println(list);

    }
}
