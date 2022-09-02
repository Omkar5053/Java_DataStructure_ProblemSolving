package Arrays;

//O(n)
public class MaxSubArraySumKadanes {
    public static void main(String[] args)
    {
        int[] arr = {-1, -2, 6, -1, -3};
        System.out.println(getMax(arr));
    }

    private static int getMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        //if in array all elements are negative then kadane's doesn't work then we have to do this
        boolean flag = true;
        //it will check whether given array contain all negatives or not
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>0)
                flag = false;
        }

        if(flag) //false means inside array positive elements exist eventhough the count of positive is one
        {
            for(int i = 0; i<arr.length; i++)
            {
                if(arr[i] > max)
                    max = arr[i];
            }
        } else
        {
            for(int i = 0; i<arr.length; i++)
            {
                sum = sum + arr[i];
                if(sum < 0)
                {
                    sum = 0;
                }
                if(sum > max)
                {
                    max = sum;
                }

            }
        }
        return max;
    }
}
