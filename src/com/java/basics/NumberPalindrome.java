package com.java.basics;

public class NumberPalindrome {

    static void palindromeCheck(int num){
        int rem,sum=0,temp;
        temp=num;
        while (num>0){
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;

        }
        if (temp==sum)
            System.out.println("Given number is a Palindrome");
        else
            System.out.println("Given number is not a Palindrome");
    }

    public static void main(String[] args) {
        int num=1211;
        palindromeCheck(num);
    }
}
