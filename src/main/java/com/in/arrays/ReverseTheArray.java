package com.in.arrays;
//import java.util.Arrays;
public class ReverseTheArray {
    public static void main(String[] args){

        int[] arr = {2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println("Length of the arr: " + arr.length);
        System.out.print("Original Array.....");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Reversed Array.....");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
