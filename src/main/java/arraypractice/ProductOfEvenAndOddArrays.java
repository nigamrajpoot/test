package arraypractice;

import java.util.ArrayList;

public class ProductOfEvenAndOddArrays
{
    public static void main(String[] args)
    {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45, 10};

        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        int EvenProd = 1;
        int OddProd = 1;
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
        System.out.print("Product of the Even Array: ");
        for(int i: al)
        {
            EvenProd = EvenProd * i;
        }
        System.out.println(EvenProd + " ");
        System.out.println("...........................");
        System.out.print("Product of Odd array: ");
        for(int i: al1)
        {
            OddProd = OddProd * i;
        }
        System.out.print(OddProd + " ");
    }
}
