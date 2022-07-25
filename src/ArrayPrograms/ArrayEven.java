package ArrayPrograms;

public class ArrayEven {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("even numbers in an arry ");
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");

        }
    }
}
