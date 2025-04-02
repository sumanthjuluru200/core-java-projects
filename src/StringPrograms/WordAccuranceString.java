package StringPrograms;

import java.util.Arrays;

public class WordAccuranceString {
    public static void main(String[] args) {
        String input = "error is error because error";
        long count = Arrays.stream(input.split(" ")).filter(f -> f.equalsIgnoreCase("error")).count();
        System.out.println("error :" + count);
    }
}
