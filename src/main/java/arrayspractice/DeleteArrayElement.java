package arrayspractice;

public class DeleteArrayElement
{
    public static void main(String[] args)
    {
        int[] arr = {10, 30, 20, 40, 50, 70, 80, 90};

        int del_ele = 30;

        for(int i = 0; i < arr.length; i++)
        {
            if(del_ele == arr[i])
            {
                for(int j = i; j < arr.length-1; j++)
                {
                    arr[j] = arr[j+1];
                }
            }
        }
        for(int i = 0; i < arr.length-1; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
