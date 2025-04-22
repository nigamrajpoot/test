package com.in.arrays;

public class BubbleSortString {

    public static void main(String[] args){

        String[] arr = {"Deepak", "Sanjay", "Arun", "Nigam", "Varun", "Rahul"};

        for(int i = 0; i < arr.length; i++){

             int flag = 0;
            for(int j = 0; j < arr.length-1-i; j++){

                if(arr[j].compareTo(arr[j+1]) > 0){

                    String temp = arr[j];

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

            System.out.print(arr[i]+ " ");
        }
    }
}
