package StringPrograms;

import java.util.LinkedHashMap;

public class CharAccuranceString {

    static void charAccurance(String inputString) {
        char[] chr = inputString.toCharArray();
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char c : chr) {
            if (c == ' ') {
                continue;
            }

            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);

            } else {
                charCountMap.put(c, 1);
            }

        }
        charCountMap.forEach((k, v) -> System.out.println(k + " - " + v));
    }

    public static void main(String[] args) {
        String inputString = "aa bb cc dd";
        charAccurance(inputString);
    }
}
