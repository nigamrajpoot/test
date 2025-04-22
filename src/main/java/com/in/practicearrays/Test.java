package com.in.practicearrays;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter array size: ");
        int length =input.nextInt();
        int[] arr = new int[length];
        System.out.println("Please enter your array element: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
       // System.out.println("Array element is: "+arr[3]);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
