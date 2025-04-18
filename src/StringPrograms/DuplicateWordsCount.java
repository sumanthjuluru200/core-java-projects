package StringPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsCount {
    public static void main(String[] args) {

        String input = "Java is great and Java is powerful. Java is widely used.";

        List<String> words = Arrays.stream(input.toLowerCase().split("\\W+")).toList();
        Map<String, Long> wordsCount = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        wordsCount.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);

    }
}
