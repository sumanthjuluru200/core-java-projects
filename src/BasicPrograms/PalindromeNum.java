package BasicPrograms;

public class PalindromeNum {
    static void palindromeCheck(int num) {
        int rem, sum = 0, temp;
        temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if (temp == sum)
            System.out.println("Given number is a palindrome");
        else
            System.out.println("Given number isn not a palindrome");
    }

    public static void main(String[] args) {
        int num = 121;
        palindromeCheck(num);
    }
}
