package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateChars {

    static void duplicates(String inputString) {
        List<Character> characterList = new ArrayList<>();
        char[] chars = inputString.toCharArray();
        for (char c : chars) {
            characterList.add(c);
        }

        Set<Character> characterSet = characterList.stream().filter(f -> Collections.frequency(characterList, f) > 1).collect(Collectors.toSet());
        System.out.print(characterSet);
    }

    public static void main(String[] args) {
        String inputString = "aaaaabbbbbccccccdddd";
        duplicates(inputString);
    }
}
