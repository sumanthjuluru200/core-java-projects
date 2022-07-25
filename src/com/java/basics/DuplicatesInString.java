package com.java.basics;

public class DuplicatesInString {

    static void duplicateChar(String str){
        char[] chr=str.toCharArray();
        for (int i=0;i<chr.length;i++){
            for (int j=i+1;j<chr.length;j++){
                if (chr[i]==chr[j]){
                    System.out.print(chr[j]+" ");

                }
            }
        }
    }

    public static void main(String[] args) {
        String str="welcome";
        duplicateChar(str);
    }
}
