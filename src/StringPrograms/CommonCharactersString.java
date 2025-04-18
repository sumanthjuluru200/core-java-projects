package StringPrograms;

import java.util.List;

public class CommonCharactersString {
    public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "gaming";

        List<Character> list1 = str1.chars().mapToObj(c -> (char) c).toList();
        List<Character> list2 = str2.chars().mapToObj(c -> (char) c).toList();
        List<Character> common = list1.stream().filter(list2::contains).distinct().sorted().toList();
        System.out.println("Common Characters " + common);
    }
}
