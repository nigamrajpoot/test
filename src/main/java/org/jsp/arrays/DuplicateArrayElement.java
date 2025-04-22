package org.jsp.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateArrayElement
{
    public static void duplicateArrayElement(int[] arr)
    {
        Map<Integer, Integer> map1 = new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(map1.containsKey(arr[i]))
            {
                int value = map1.get(arr[i]);
                map1.put(arr[i], value+1);
            }
            else
            {
                map1.put(arr[i], 1);
            }
        }
      //  System.out.print(map1 +" ");
        List<Integer> list1 = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map1.entrySet() )
        {
            if(entry.getValue()>1)
            {
                list1.add(entry.getKey());
            }
        }

        System.out.println(list1);
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 2, 5, 3, 2, 3, 5, 5, 5, 9, 1, 9, 1, 9, 2};
        duplicateArrayElement(arr);
    }
}
