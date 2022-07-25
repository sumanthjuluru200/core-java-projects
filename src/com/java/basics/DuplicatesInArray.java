package com.java.basics;

public class DuplicatesInArray {

    static void duplicates(int arr[],int num){
        for (int i=0;i<num;i++){
            for (int j=i+1;j<num;j++){
                if (arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,3,4};
        int len=arr.length;
        duplicates(arr,len);

    }
}
