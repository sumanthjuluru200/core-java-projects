package StringPrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class EachWordAccuranceString {

    public static void main(String[] args) {


        String input = "error is error because error";
        String[] words = input.toLowerCase().split(" ");
        Map<String, Long> wordsCount = Arrays.stream(words).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        wordsCount.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
