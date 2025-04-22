package arrayspractice;

public class MaxMinArrayElement
{
    public static void main(String[] args)
    {
        int[] arr = {10, 30, 40, 50, 80, 90, 70, 60, 56, 9};

        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                min = max;
                max = arr[i];
            }
            else if(arr[i] > min && arr[i] != max)
            {
                min = arr[i];
            }
        }
        System.out.println("Minimum value: "+min + "Maximum value: "+max);
    }
}
