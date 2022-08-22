package Arrays;

public class MaxSubArraySumPrefix {
    public static void main(String[] args)
    {
        int arr[] = {1, -2, 6, -1, 3};
        System.out.println(findMaxByPrefix(arr));
    }

    private static int findMaxByPrefix(int[] arr)
    {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }
        int max = Integer.MIN_VALUE;

        int sum;
        //this loop find maxSum of SubArrays
        for(int i = 0; i<arr.length; i++)
        {
            sum = 0;
           for(int j = i+1; j<arr.length; j++)
           {
               sum = prefix[j] - prefix[i-1];
               if(sum > max)
                   max = sum;
           }
        }
        return max;
    }
}
