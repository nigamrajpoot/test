package org.jsp.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArrayElement
{
    public static void removeDuplicate(int[] arr)
    {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);
        for(int set1 : set)
        {
            System.out.print(set1 +" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 6, 7, 7, 8, 9}; // 1, 2, 3, 4, 5, 6, 7, 8, 9...
        removeDuplicate(arr);
    }
}
