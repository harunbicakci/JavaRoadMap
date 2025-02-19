package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountInAWord {

    public static void charCount(String givenWord){

        String modifiedString = givenWord.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] arr = modifiedString.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : arr){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) +1);
            }else{
                map.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 0){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String givenString = "Ellephant";

        charCount(givenString);
    }
}
