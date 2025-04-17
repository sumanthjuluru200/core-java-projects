package StringPrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsOccurrence {

    public static void main(String[] args) {
        String input = "error is error because its an error is";
        Map<String, Long> words = Arrays.stream(input.split("\\W+")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        words.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);

    }
}
