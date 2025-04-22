package arrayspractice;

public class MissingArrayElement
{
    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int expect_arr = arr.length + 1;
        int expect_arr_sum = (expect_arr *(expect_arr+1))/2;
        //System.out.println(expect_arr_sum);
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }

        int misele = expect_arr_sum - sum;
        System.out.println("Missing array element is: "+misele);
    }
}
