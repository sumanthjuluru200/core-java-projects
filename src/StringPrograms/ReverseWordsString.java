package StringPrograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsString {
    public static void main(String[] args) {
        String original = "i love java";
        System.out.println("original string " + original);

        String reverse = Arrays.stream(original.split(" ")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println("reversed string " + reverse);
    }
}
