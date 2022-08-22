package Arrays;

public class CountingSorting {
    public static void main(String[] args)
    {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        countSort(arr);

        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }

    private static void countSort(int[] arr)
    {
        int maxRange = Integer.MIN_VALUE;
        //for find max value or range (till then i have to made count array) from original array
        for(int i = 0; i<arr.length; i++)
        {
            maxRange = Math.max(maxRange, arr[i]);
        }

        int count[] = new int[maxRange+1];

        //for count frequency of every element
        for(int i = 0; i<arr.length; i++)
        {
            count[arr[i]]++;  //by default count[1] = 0;
            // after get value from arr ,for i = 0 in arr[0] = 1,
            // So count[1] increase by 1 means previous count[1] = 0 now 0+1 = 1;
        }

        //now we will do sorting
        int i =0;
        for(int j = 0; j<count.length; j++)
        {
            while(count[j]>0)
            {
                arr[i] = j;
                i++;
                count[j]--;
            }
        }
    }
}
