package com.in.arrays;

public class MaximumElementInArrays {

    public static void main(String[] args){

        int[] arr = {4, 8, 3, 1, 7, 9, 12, 15};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > max){

                max = arr[i];
            }
        }
        System.out.println("Maximum element is: " +max);
    }
}
