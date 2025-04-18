package ArrayPrograms;

public class ArraySegZeroAndOnes {

    static void segregation(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < num; i++) {
            arr[i] = 1;
        }
    }

    static void print(int[] arr, int num) {
        System.out.println("After segregation ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1};
        int len = arr.length;
        segregation(arr, len);
        print(arr, len);
    }
}
