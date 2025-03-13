package practice;

public class Palindrome1 {


    static void palindromeNum(int num){
        int rem,temp,sum=0;
        temp=num;

        while(num>0){
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }

        if (temp==sum){
            System.out.println("given number is palindrome");
        }else{
            System.out.println("Givne number is not a plindrome");
        }
    }

    public static void main(String[] args) {
        int num=121;
        palindromeNum(num);
    }
}
