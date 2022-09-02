package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class MedainOfTwoSortedArray {
    public static void main(String[] args)
    {
        int a[] = {3, 1, 1, 2};
        int b[] = {4, 3, 3, 2, 1, 5};

        System.out.println(getMedian(a,b));
    }
    private static int getMedian(int[] a, int[] b)
    {
        int medain;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<a.length; i++)
        {
            set.add(a[i]);
        }
        for(int i = 0; i<b.length; i++)
        {
            set.add(b[i]);
        }
        int[] ans = new int[set.size()];
        int i = 0;
        for(int e: set)
        {
            ans[i++] = e;
        }
        System.out.println(Arrays.toString(ans));
        int start = 0;
        int end = ans.length - 1;
        int mid = (start + end) / 2;
        if(ans.length%2 == 0)
        {
            medain = (ans[mid] + ans[mid+1])/2;
            return medain;
        } else
        {
            return ans[mid];
        }
    }
}
