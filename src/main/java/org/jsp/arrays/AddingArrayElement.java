package org.jsp.arrays;

public class AddingArrayElement
{
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        int a1 = arr1.length;
        int a2 = arr2.length;

        int a3 = a1+a2;
        int[] arr3 = new int[a3];

        for(int i = 0; i < a1; i++)
        {
            arr3[i] = arr1[i];
        }

        for(int j = 0; j < a2; j++)
        {
            arr3[a1 + j] = arr2[j];
        }

        for(int i = 0; i < a3; i++)
        {
            System.out.print(arr3[i] + " ");
        }
    }
}
