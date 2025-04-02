package StringPrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterOccurance {

    public static void main(String[] args) {
        String string = "aabbccdd";
        String withoutSpace = string.replace(" ", "");
        String[] words = withoutSpace.toLowerCase().split("");
        char[] chars = string.toCharArray();
        Map<String, Long> charCountMap = Arrays.stream(words).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        charCountMap.forEach((k, v) -> System.out.println(k + " : " + v));

    }
}
