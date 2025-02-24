package org.example;

import java.util.*;

public class FindMaxAndMinNumbersInAnArray {

    public static void main(String[] args) {
        int[] arr = {12, 23, 41, 73, 13, 2, 98, 94, 35};

        System.out.println("The largest number in thi array is --> " + findMaxNumber(arr));
        System.out.println("The smallest number in thi array is --> " + findMinNumber(arr));
        System.out.println("The second largest number in thi array is --> " + findSecondMaxNumber(arr));
        System.out.println("Sorting the array --> " + Arrays.toString(sortTheArray(arr)));
    }

    public static int findMaxNumber(int[] arr){
        int maxNo = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxNo){
                maxNo = arr[i];
            }
        }
        return maxNo;
    }

    public static int findMinNumber(int[] arr){
        int minNo = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minNo){
                minNo = arr[i];
            }
        }
        return minNo;
    }

    public static int findSecondMaxNumber(int[] arr){
        int maxNo = arr[0];
        int secondMaxNo = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxNo){
                secondMaxNo = maxNo;
                maxNo = arr[i];
            }else if(arr[i] > secondMaxNo && arr[i] != maxNo) {
                secondMaxNo = arr[i];
            }
        }
        return secondMaxNo;
    }

    public static int[] sortTheArray (int[] arr){

        Arrays.sort(arr);

        return arr;
    }

}

