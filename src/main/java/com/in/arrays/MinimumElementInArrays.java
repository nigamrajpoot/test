package com.in.arrays;

public class MinimumElementInArrays {

    public static void main(String[] args){

        int[] arr = {4, 3, 8, 9, 2, 1, 14, 15};

        int min = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] < min){

                min = arr[i];
            }
        }
        System.out.println("Minimum element is: "+min);
    }
}
