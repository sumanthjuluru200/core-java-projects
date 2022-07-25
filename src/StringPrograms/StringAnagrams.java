package StringPrograms;

import java.util.Arrays;
import java.util.Locale;

public class StringAnagrams {

    public static void main(String[] args) {
        String str1 = "grab";
        String str2 = "brag";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("Both string are not equal");
        }
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);
        if (Arrays.equals(string1, string2) == true) {
            System.out.println("Given strings are equal");
        } else {
            System.out.println("strings are not equal");
        }
    }
}
