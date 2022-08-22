package Arrays;

import java.util.Arrays;

public class MinimizeTheHeight {

    public static void main(String[] args)
    {
        int arr[] = {3, 9, 12, 16, 20};
        int k = 3;
        System.out.println(minimizeDiff(arr, k));
    }

    private static int minimizeDiff(int[] arr, int k)
    {
        Arrays.sort(arr);
        int minDiff = 0;
        int max = 0;
        int min = 0;

        minDiff = arr[arr.length - 1] - arr[0];
        for(int i = 1; i<arr.length-1; i++)
        {
            if(arr[i] >= k)
            {
                max = Math.max(arr[i-1]+k, arr[arr.length-1]-k);
                min = Math.min(arr[i]-k, arr[0]+k);
                minDiff = Math.min(minDiff, max - min);
            } else
                continue;
        }
        return minDiff;
    }
}
