package com.in.arrays;

public class BubbleSort2 {

    public static void main(String[] args){

        int[] arr = {54, 99, 57, 45, 3, 5, 2, 7, 9, 1};

        for(int i = 0; i < arr.length; i++){

            int flag = 0;
            for(int j = 0; j < arr.length-1-i; j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;

                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }

        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i] +" ");
        }
        System.out.println();
        System.out.println("Second largest element is: "+ arr[arr.length-2]);
    }
}
