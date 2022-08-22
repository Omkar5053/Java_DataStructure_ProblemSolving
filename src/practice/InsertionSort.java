package practice;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args)
    {
        int arr[] = {2, 5, 1, 9, 4, 67};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sortArray(int[] arr)
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = i+1; j>0; j--)
            {
                if(arr[j-1]>arr[j])
                {
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else
                    break;
            }
        }
    }
}
