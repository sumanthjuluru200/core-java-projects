package StringPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedNonRepeated {
    public static void main(String[] args) {
        String input = "swiss";
        //frequency of characters
        Map<Character, Long> frequencyMap = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //First non repeated character
        Character nonRepeatedChar = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        Character repeatedChar = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("first non repeated character is " + nonRepeatedChar);
        System.out.println("first repeated character is " + repeatedChar);
    }
}
