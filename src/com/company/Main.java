package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[]{10, 11, 88, 120, 12, 2};
        System.out.println(getMaxProfit(array));
    }

    public static int getMin(int[] array){
        int minValue = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMaxProfit(int[] array){
        return getMax(array) - getMin(array);
        //while not be valid if max appears after min;
    }
}
