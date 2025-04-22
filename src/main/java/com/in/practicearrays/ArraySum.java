package com.in.practicearrays;

import java.util.Scanner;

public class ArraySum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your size: ");
        int length = input.nextInt();

        int[] arr = new int[length];
        System.out.println("Please enter your array element: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println( "array element is: "+ arr[i] + " ");
            sum = sum + arr[i];
        }
        System.out.println( "The Sum of the Array: "+sum);
    }
}
