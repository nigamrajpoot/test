package com.in.arrays;

public class ReverseArrayElement
{
    public static void main(String[] args)
    {
        int[] arr = {2, 5, 7, 3, 6, 8, 9, 4, 1};

        System.out.print("Original array element: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n.......................");
        System.out.print("Reverse array element: ");
        for(int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
