package org.jsp.arrays;

public class MissingArrayElement
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};

        int expected_arr = arr.length + 1;
        int sum1 = (expected_arr *(expected_arr + 1))/2;

        int sum2 = 0;
        for(int i = 0; i < arr.length; i++)
        {
             sum2 += arr[i];
        }

        int missing_ele = sum1 - sum2;
        System.out.println("Missing Array Element: "+missing_ele);
    }
}
