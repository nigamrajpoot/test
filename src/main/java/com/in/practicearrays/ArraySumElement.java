package com.in.practicearrays;

import java.util.Scanner;

public class ArraySumElement
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter array of the size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Now, please enter array element: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        SumOfTheArray(arr);
    }

    public static void SumOfTheArray(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println(sum);
    }
}
