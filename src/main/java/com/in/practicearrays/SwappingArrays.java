package com.in.practicearrays;

public class SwappingArrays
{
    public static void main(String[] args)
    {
        int[] arr = {10, 30, 40, 50, 60, 70};

        int temp;
        temp = arr[0];
        arr[0] = arr[5];
        arr[5] = temp;

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
