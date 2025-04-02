package StringPrograms;

import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DulicateCharCountString {
    public static void main(String[] args) {
        String input = "abcdabcdef";
        Map<Character, Long> map = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);
    }
}
