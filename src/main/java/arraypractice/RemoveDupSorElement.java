package arraypractice;

public class RemoveDupSorElement
{
    public static void main(String[] args)
    {
        int[] arr = {1,2, 3, 3, 4, 5, 6, 6, 7, 7, 8, 9};
        int[] temp = new int[arr.length];

        int j = 0;
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[arr.length-1];
        for(int i = 0; i < temp.length; i++)
        {
            System.out.print(temp[i] +" ");
        }
    }
}
