package org.jsp.arrays;

public class SecondLargestArrayElement
{
    public static void main(String[] args)
    {
        int[] arr = {10, 30, 50, 60, 80, 220, 440};

        int largest = Integer.MAX_VALUE;
        int sec_lar = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < largest)
            {
                sec_lar = largest;
                largest = arr[i];
            }
            else if(arr[i] < sec_lar && arr[i] != largest)
            {
                sec_lar = arr[i];
            }
        }
        System.out.println("Second largest array element: "+sec_lar);
    }
}
