package arraypractice;

public class MergeTwoArrayElement
{
    public static void main(String[] args)
    {
        int[] arr1 = {10, 20, 40, 30, 50};
        int[] arr2 = {60, 90, 100, 70,};

        int a= arr1.length;
        int b = arr2.length;
        int arr = arr1.length + arr2.length;

        int[] arr3 = new int[arr];

        for(int i = 0; i < arr1.length; i++)
        {
            arr3[i] = arr1[i];
        }

        for(int j = 0; j < arr2.length; j++)
        {
            arr3[arr1.length + j] = arr2[j];
        }

        for(int i = 0; i < arr3.length; i++)
        {
            System.out.print(arr3[i] + " ");
        }
    }
}
