package arraypractice;
import java.util.HashSet;
public class SumOfDistinctArrays
{
    public static void main(String[] args)
    {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45,10};

        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            hs.add(arr[i]);
        }
        System.out.print("Sum of the Array: ");
        for(int i : hs)
        {
            sum = sum + i;
        }
        System.out.print(sum + " ");
    }
}
