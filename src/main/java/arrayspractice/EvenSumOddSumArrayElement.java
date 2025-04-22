package arrayspractice;

import java.util.ArrayList;

public class EvenSumOddSumArrayElement
{
    public static void main(String[] args)
    {
        int[] arr = {2, 3, 5, 4, 7, 18, 14, 34, 9, 19, 45};

        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                al.add(arr[i]);
            }
            else
            {
                al1.add(arr[i]);
            }
        }
        int evensum = 0;
        System.out.print("Even array element: ");
        for(int i : al)
        {
            evensum  += i;
            System.out.print(i + " ");
        }
        System.out.println(evensum);
        System.out.println();
        System.out.println("........................");
        int oddsum = 0;
        System.out.print("Odd array element: ");
        for(int j : al1)
        {
            oddsum += j;
            System.out.print(j + " ");
        }
        System.out.print(oddsum + " ");
    }
}
