package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SameWordHowManyTimes {

    public static void calculateWords(String givenString){

        String modifiedString = givenString.toLowerCase().replaceAll("\\.", "");
        String[] arr = modifiedString.split(" ");
        Map<String, Integer> map = new TreeMap<>();

        for(String el : arr){
            if(map.containsKey(el)){
                map.put(el, map.get(el) +1);
            }else{
                map.put(el, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 0){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args){

        String givenString = "The quick brown fox jumped under the nearby tree. What the fox did next surprised the crowd. The silence was followed by the applause. Applause that lasted for minutes. The fox blushed under the tree.";

        calculateWords(givenString);
    }


}
