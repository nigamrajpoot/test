package arraypractice;

import java.util.HashSet;

public class RemoveDuplicateArrayElement
{
    public static void main(String[] args)
    {
        System.out.println("Main method is started");

        int[] arr = {2, 2, 4, 5, 3, 4, 3, 8, 9, 8, 7};
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < arr.length; i++)
        {
            hs.add(arr[i]);
        }
        for(int i : hs)
        {
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("Main method is ended");
    }
}
