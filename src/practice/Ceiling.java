package practice;

//Ceiling of any number is that number who is equals to that number or the just greater than that number
// like as in the given array- Ceiling of 1 is 2, Ceiling of 9 is 10, ceiling of 8 is 8.
public class Ceiling {
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 8, 10, 19};
        int target = 9;
        System.out.println(result(arr,target));
    }

    private static int result(int[] arr, int target) {

        if(target > arr[arr.length -1])
        {
            return -1;
        }
        int s = 0;
        int end = arr.length -1;

        while(s <= end)
        {
            int mid = s + (end - s)/2;

            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                s = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return s;
    }
}
