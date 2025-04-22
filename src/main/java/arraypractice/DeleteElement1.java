package arraypractice;

public class DeleteElement1
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 40, 80, 30, 90, 50, 70};
        int del_ele = 40;

        for(int i = 0; i < arr.length; i++)
        {
            if(del_ele == arr[i])
            {
                for(int j = i; j < arr.length - 1; j++)
                {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
        for(int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }
}
