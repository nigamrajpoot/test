package com.in.arrays;

public class FirstDuplicateElement {

    public static void main(String[] args){

        int[] arr = {6, 5, 3, 2, 5, 1, 2, 4};

        for(int i = 0; i < arr.length; i++){

            int temp = 0;
            for(int j = i+1; j < arr.length; j++){

                if(arr[i] == arr[j]){
                    System.out.println("First duplicate element: "+arr[i]);
                    temp = temp + 1;
                    break;
                }
            }
            if(temp > 0){
                break;
            }
        }
    }
}
