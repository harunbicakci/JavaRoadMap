package org.example;

public class ReverseString {

    public static String reverseStr(String str){
        String str2 = "";
        char[] arr = str.toCharArray();
        for(int i = arr.length -1; i >= 0; i--){
            str2 += arr[i];
        }

        return str2;
    }

    public static void main(String[] args) {

        System.out.println(reverseStr("Harley Davidson"));

    }
}
