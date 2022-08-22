package Arrays;

public class BinarySearch {
    public static void main(String[] args)
    {
        int arr[] = {1, 3, 8, 9, 12, 34};
        int target = 12;

        System.out.println(search(arr, 0, arr.length-1, target));
    }
    private static int search(int[] arr, int start, int end, int target)
    {


        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid] == target)
                return mid;

            if(arr[mid] > target)
            {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

}
