package com.in.practicearrays;

public class OddEvenSumArrayElement
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        calculateOddEvenArraySum(arr);
    }

    public static void calculateOddEvenArraySum(int[] arr)
    {
        int EvenSum = 0;
        int OddSum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                EvenSum = EvenSum + arr[i];
            }
            else
            {
                OddSum = OddSum + arr[i];
            }
        }
        System.out.println(EvenSum);
        System.out.println(OddSum);
    }
}
