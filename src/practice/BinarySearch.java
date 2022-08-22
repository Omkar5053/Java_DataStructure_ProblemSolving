package practice;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr={2,4,45,67,78,98,102};
        int target = 102;
        System.out.println(search(arr,0, arr.length-1,target));

    }

    private static int search(int[] arr, int s, int e, int target)
    {
        if(s>e)
        {
            return -1;
        }

        int mid = s + (e-s)/2;

        if(target == arr[mid])
            return mid;

        if(target > arr[mid]) {
            return search(arr, mid + 1, e, target);
        }
            return search(arr, s, mid-1, target);
    }
}
