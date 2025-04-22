package org.jsp.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElement1 {
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 2, 5, 3, 2, 3, 5, 5, 5, 9, 1, 9, 1, 9, 2};

        Set<Integer> set = new HashSet<>();

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!set.add(arr[i]))
            {
               list.add(arr[i]);
            }
        }
        System.out.println(list.stream().collect(Collectors.toSet()));
    }
}
