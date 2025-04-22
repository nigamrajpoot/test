package arraypractice;

import java.util.HashSet;

public class ProductDistinctArrays
{
    public static void main(String[] args)
    {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45, 10};

        HashSet<Integer> hs = new HashSet<>();
        int prod = 1;

        for(int i = 0; i < arr.length; i++)
        {
            hs.add(arr[i]);
        }
        System.out.print("Product of the Array: ");
        for(int i: hs)
        {
            System.out.print(i + " ");
            prod = prod * i;
        }
        System.out.print(prod + " ");
    }
}
