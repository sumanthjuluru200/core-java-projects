package StringPrograms;

import java.util.Optional;

public class StringRotation {

    static boolean isRotation(String string1, String string2) {
        return Optional.ofNullable(string1)
                .filter(s -> string2 != null)
                .filter(s -> s.length() == string2.length())
                .map(s -> (s + s).contains(string2))
                .orElse(null);
    }

    public static void main(String[] args) {
        String string1 = "abcd";
        String string2 = "cdab";
        Optional.of(isRotation(string1, string2))
                .ifPresent(result -> {
                    if (result) {
                        System.out.println(string2 + " is rotation of " + string1);
                    } else {
                        System.out.println(string2 + " is roation of " + string1);
                    }
                });
    }
}
