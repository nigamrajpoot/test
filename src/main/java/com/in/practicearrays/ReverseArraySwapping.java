package com.in.practicearrays;

import java.util.Scanner;

public class ReverseArraySwapping
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your array size: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter your array element: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        ReverseArray(arr);
    }
    public static void ReverseArray(int[] arr)
    {
        int sp = 0;
        int ep = arr.length-1;
        int temp;

        while(sp < ep)
        {
            temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
