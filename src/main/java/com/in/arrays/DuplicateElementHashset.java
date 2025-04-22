package com.in.arrays;
import java.util.Set;
import java.util.HashSet;

public class DuplicateElementHashset {

    public static void main(String[] args){
        System.out.print("Duplicate elements are: ");
        int[] arr = {3, 4, 5, 3, 2, 2, 1,};

        Set<Integer> s = new HashSet<>();

        for(int i = 0; i<arr.length; i++){

            if (s.add(arr[i]) != true){

                System.out.print(arr[i] + " ");
            }
        }
    }
}
