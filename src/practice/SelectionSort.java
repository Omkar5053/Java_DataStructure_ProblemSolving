package practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String [] args)
    {
        int[] arr = {2, 4, 1, 9, 5, 34};
//        sortArray(arr, arr.length - 1, 0, 0);
//        System.out.println(Arrays.toString(arr));


        //selection sort without recursion
        //time complexity = O(n^2)

        for(int i = 0; i<arr.length; i++)
        {
            int max = 0;
            for(int j = 0; j<arr.length - i; j++)
            {
                if(arr[j]>arr[max])
                {
                    max = j;
                }
            }
            //swap with the last index
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[max];
            arr[max] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }



    private static void sortArray(int[] arr, int e, int s, int max) {
        if(e == 0)
            return;

        if(s <= e)
        {
            if(arr[s] > arr[max])
            {
                max = s;
            }
            sortArray(arr, e, s+1, max);
        } else {
            int temp = arr[e];
            arr[e] = arr[max];
            arr[max] = temp;
            sortArray(arr, e-1, 0, 0);
        }

    }
}
