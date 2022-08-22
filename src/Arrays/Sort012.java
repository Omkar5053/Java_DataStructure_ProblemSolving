package Arrays;

public class Sort012 {
    public static void main(String[] args)
    {
        int arr[] = {0, 1, 0, 1, 2, 0, 1, 2};

        //sortArray(arr);
        sortWithTwoPointer(arr);
        //print the sorted array
        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i]+" ");

    }
    private static void sortWithTwoPointer(int[] arr)
    {
        int ptr1 = 0; //it will track the next position where we have to insert the 0
        int ptr2 = arr.length-1; //it will track the next position where we have to insert the 2
        int i = 0;

        while(i<=ptr2)
        {
            if(arr[i] == 0)
            {
                int temp = arr[i];
                arr[i] = arr[ptr1];
                arr[ptr1] = temp;
                ptr1++;
                i++;
            } else if(arr[i] == 2)
            {
                int temp = arr[i];
                arr[i] = arr[ptr2];
                arr[ptr2] = temp;
                ptr2--;
            } else
            {
                i++;
            }
        }
    }

    private static void sortArray(int[] arr)
    {
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == 0)
                count_0++;
            else if(arr[i] == 1)
                count_1++;
            else
                count_2++;
        }
        //now place all 0,1 and 2 in ascending order
        int i = 0;
        while(count_0>0)
        {
            arr[i] = 0;
            i++;
            count_0--;
        }
        while(count_1>0)
        {
            arr[i] = 1;
            i++;
            count_1--;
        }
        while(count_2>0)
        {
            arr[i] = 2;
            i++;
            count_2--;
        }

    }
}
