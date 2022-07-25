package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateChar {

    static void duplicates(String inputString) {

        List<Character> set = new ArrayList<>();
        char[] charArray = inputString.toCharArray();
        for (char c : charArray) {
            set.add(c);
        }

        Set<Character> duplicates = set.stream().filter(f -> Collections.frequency(set, f) > 1).collect(Collectors.toSet());
        System.out.println(duplicates);
    }

    public static void main(String[] args) {
        String inputString = "aaaaabbbbbbccccccddddddeeeeee";
        duplicates(inputString);

    }
}
