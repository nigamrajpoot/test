package com.in.arrays;

public class KLargestElement {

    public static void main(String[] args){

        int[] arr = {5, 8, 12, 7, 6, 2, 4};
        int k = 3;

        for(int i = 0; i < arr.length; i++){

            for(int j = i+1; j < arr.length; j++){

                if(arr[i] < arr[j]){

                    int temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;
                }
            }
            if(i == k-1){
                System.out.print(" K " + "Largest element is: "+ arr[i]);
                break;
            }
        }
        System.out.println(".........................................");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
