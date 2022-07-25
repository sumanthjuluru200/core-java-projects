package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNums {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNums = integerList.stream().filter(f -> f % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers " + evenNums);

        List<Integer> oddNums = integerList.stream().filter(m -> m % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd Nums " + oddNums);
    }
}
