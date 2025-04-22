package arrayspractice;

import java.util.HashSet;

public class RemoveDuplicateArrayEle
{
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 2, 2, 5, 4, 5, 6, 3, 8, 9, 9, 8, 5, 11, 9, 23, 34,23};

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < arr.length; i++)
        {
            hs.add(arr[i]);
        }

        for(int i: hs)
        {
            System.out.print(i + " ");
        }
    }
}
