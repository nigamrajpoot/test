package arrayspractice;

public class MergeTwoArrayElement
{
    public static void main(String[] args)
    {
        int[] arr1 = {10, 30, 40, 60, 50};
        int[] arr2 = {20, 70, 80, 90};

        int arr1_leng = arr1.length;
        int arr2_leng = arr2.length;
        int arr3_leng = arr1.length + arr2.length;

        int[] arr3 = new int[arr3_leng];

        for(int i = 0; i < arr1.length; i++)
        {
            arr3[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++)
        {
            arr3[arr1.length + i] = arr2[i];
        }

        for(int i = 0; i < arr3.length; i++)
        {
            System.out.print(arr3[i] + " ");
        }
    }
}
