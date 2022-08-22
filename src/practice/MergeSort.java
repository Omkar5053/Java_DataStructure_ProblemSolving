package practice;

import java.util.Arrays;

public class MergeSort {
    public static void main(String []args)
    {
        int[] arr = {12, 4, 6, 89, 9, 23};
        int[] a = sorting(arr);
        System.out.println(Arrays.toString(a));
        sortingInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sorting(int[] arr) {
        if(arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = sorting(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sorting(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] ans = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length)
        {
            if(first[i] < second[j])
            {
                ans[k] = first[i];
                i++;
            }
            else
            {
                ans[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length)
        {
            ans[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length)
        {
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }


    private static void sortingInPlace(int[] arr, int s, int e) {
        if(e - s == 1)
            return;

        int mid = (s + e) / 2;

        sortingInPlace(arr, s, mid);
        sortingInPlace(arr, mid, e);

        mergeSortInPlace(arr, s, mid, e);

    }

    private static void mergeSortInPlace(int[] arr, int s, int mid, int e) {
        int[] ans = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while(i < mid && j < e)
        {
            if(arr[i] < arr[j])
            {
                ans[k] = arr[i];
                i++;
            }
            else
            {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid)
        {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while(j < e)
        {
            ans[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < ans.length; l++)
        {
            arr[s + l] = ans[l];
        }
    }
}
