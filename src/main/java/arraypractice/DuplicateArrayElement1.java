package arraypractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateArrayElement1
{
    public static void findDuplicate(int[] arr)
    {
        Map<Integer, Integer> map1 = new HashMap<>();
        List<Integer> list = new ArrayList<>();

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
        for(Map.Entry<Integer, Integer> entry : map1.entrySet() )
        {
            if(entry.getValue() > 1)
            {
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
        for(int list1 : list)
        {
            System.out.print(list1 +" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 2, 5, 3, 2, 3, 5, 5, 5, 9, 1, 9, 1, 9, 2};
        findDuplicate(arr);
    }
}
