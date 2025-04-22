package org.jsp.arrays;

public class DeleteArrayElement
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 70, 50, 60};

        int item = 70;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == item)
            {
                for(int j = i; j < arr.length-1; j++)
                {
                    arr[j] = arr[j+1];
                }
            }
        }

        for(int i = 0; i < arr.length-1; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
