package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 3);
        System.out.println("duplicate numbers");
        Set<Integer> list2 = list.stream().filter(f -> Collections.frequency(list, f) > 1).collect(Collectors.toSet());
        System.out.println(list2 + " ");

        System.out.println("orignal numbers");
        List<Integer> originalNumbers = list.stream().distinct().collect(Collectors.toList());
        System.out.println(originalNumbers);

        List<String> string = Arrays.asList("sumanth", "messi", "juluru", "messi");

        System.out.println("duplicate strings");
        Set<String> dulicateStrings = string.stream().filter(i -> Collections.frequency(string, i) > 1).collect(Collectors.toSet());
        System.out.println(dulicateStrings);
        List<String> startWith=string.stream().filter(e->e.startsWith("s")).collect(Collectors.toList());
        System.out.println("startWith s- "+startWith);

    }
}
