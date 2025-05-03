import streamapi.ListMergeAndSort;

import java.util.Arrays;
import java.util.List;

public class StringStartsWith {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "2wo", "three", "4our", "five", "6ix");
        List<String> result = list.stream().filter(s -> Character.isDigit(s.charAt(0))).toList();
        System.out.println(result);
    }
}
