package arraypractice;

import java.util.HashSet;

public class DistinctArrayElement
{
    public static void main(String[] args)
    {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < arr.length; i++)
        {
            hs.add(arr[i]);
        }
        System.out.print("Distinct array element: ");
        for(int i: hs)
        {

        }
        System.out.print(hs+ " ");
    }
}
