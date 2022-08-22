package Arrays;

public class MaxSubArraySum {

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, -2, 5};

        System.out.println(findMaxSum(arr));
    }

    private static int findMaxSum(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int sum;
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i; j<arr.length; j++)
            {
                sum = 0;
                for(int k = i; k<=j; k++)
                {
                    sum = sum + arr[k];
                }
                if(sum>max)
                    max = sum;
            }
        }
        return max;
    }
}
