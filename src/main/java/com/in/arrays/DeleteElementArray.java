package com.in.arrays;

public class DeleteElementArray
{
    public static void main(String[] args)
    {
        int[] arr = {10, 40, 30, 80, 60, 20, 90, 70};

        int del_ele = 40;

        for(int i = 0; i < arr.length; i++)
        {
            if(del_ele == arr[i])
            {
                for(int j = i; j < arr.length-1; j++)
                {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
        for(int i = 0; i < arr.length-1; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
