package com.java.practice;

public class SecondLargestNum {


    static int secondLargestNum(int arr[], int total){

        int temp;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        return arr[total-2];
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};
        int len=arr.length;
        System.out.println(secondLargestNum(arr,len));



    }
}
