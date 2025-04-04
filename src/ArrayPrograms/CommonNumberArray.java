package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class CommonNumberArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8, 1, 2};
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        System.out.println("Common Elements");
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.println(num);
            }
        }
    }
}
