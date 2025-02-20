package org.example;

public class PalindromeString {

    public static void checkPalindromeOrNot(String str){
        String reversed = "";

        for(int i = str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }

        if(str.equals(reversed)){
            System.out.println("The word " + str + " is palindrome! --> " + reversed);
        }else{
            System.out.println("The word " + str + " is NOT palindrome! --> " + reversed);
        }
    }

    public static void main(String[] args) {

        checkPalindromeOrNot("radar");


    }


}
