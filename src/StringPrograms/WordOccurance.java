package StringPrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccurance {
    public static void main(String[] args) {
        String string = "error is an error because its error";
        String[] words = string.split(" ");
        Map<String, Long> wordCount = Arrays.stream(words).filter(f -> f.equalsIgnoreCase("error")).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        wordCount.forEach((k, v) -> System.out.print(k + " : " + v));
    }
}
