package ArrayPrograms;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraySegregation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> even = IntStream.of(arr).boxed().filter(f -> f % 2 == 0).toList();
        List<Integer> odd = IntStream.of(arr).boxed().filter(f -> f % 2 != 0).toList();
        List<Integer> result = Stream.concat(even.stream(), odd.stream()).toList();
        System.out.print(result);
    }
}
