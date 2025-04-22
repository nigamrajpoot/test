package com.in.arrays;

public class SecondLargestElement2 {

    public static void main(String[] args){

        int[] arr = {6, 8, 2, 4, 3, 1, 5, 7, 9};

        int Largest = Integer.MIN_VALUE;
        int Second_Largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > Largest){
                Second_Largest = Largest;
                Largest = arr[i];
            }
            else if(arr[i] > Second_Largest && arr[i] != Largest){
                Second_Largest = arr[i];
            }
        }
        System.out.println("Second largest element is: "+ Second_Largest);
    }
}
