package practice;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args)
    {
        int[] arr = {12, 4, 23, 8, 5, 90};
        //sortArray(arr, arr.length - 1, 0);
        //System.out.print(Arrays.toString(arr));

        //without recursion bubble sort
        //time complexity = O(n^2)
        for(int i = 0; i<arr.length - 1; i++)
        {
            for(int j = 0; j<arr.length - i - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    //to print sorted array
    private static void printArray(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    private static void sortArray(int[] arr, int e, int s) {
        if(e == 0)
            return;

        if(s < e)
        {
            if(arr[s] > arr[s+1])
            {
                int temp = arr[s];
                arr[s] = arr[s+1];
                arr[s+1] = temp;
            }
            sortArray(arr, e, s+1);
        }
        else
        {
            sortArray(arr, e-1, 0);
        }
    }

}
