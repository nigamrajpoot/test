package arrayspractice;

public class SecondLargestArrayElement
{
    public static void main(String[] args)
    {
        int[] arr = {20, 10, 40, 50, 80, 90, 110, 290};

        int largest = Integer.MIN_VALUE;
        int sec_Largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                sec_Largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > sec_Largest && arr[i] != largest)
            {
                sec_Largest = arr[i];
            }
        }
        System.out.println("Second largest element is: "+sec_Largest);
    }
}
