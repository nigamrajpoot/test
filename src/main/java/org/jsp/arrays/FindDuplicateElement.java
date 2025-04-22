package org.jsp.arrays;

import java.util.HashSet;

public class FindDuplicateElement
{
    public static void duplicateArrayElement(int[] arr)
    {

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    set.add(arr[i]);
                }
            }
        }
        for(int s : set)
        {
            System.out.print(s +" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 2, 5, 3, 3};
        duplicateArrayElement(arr);
    }
}
