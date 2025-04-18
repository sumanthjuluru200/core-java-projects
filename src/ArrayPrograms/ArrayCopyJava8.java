package ArrayPrograms;

import java.util.Arrays;

public class ArrayCopyJava8 {

    public static void main(String[] args) {


        int[] original = {1, 2, 3, 4, 5};
        int[] copy = Arrays.stream(original).toArray();
        System.out.println("Original Array " + Arrays.toString(original));
        System.out.print("Copied Array " + Arrays.toString(copy));

    }
}
