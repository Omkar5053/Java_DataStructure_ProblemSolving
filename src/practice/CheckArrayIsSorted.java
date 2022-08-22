package practice;

public class CheckArrayIsSorted {
    public static void main(String [] args)
    {
        int[] arr = {2, 5, 23, 8, 19};
        System.out.println(check(arr,0));
    }

    private static boolean check(int[] arr, int i)
    {
        if(arr.length - 1 == i)
            return true;
        return (arr[i] < arr[i+1]) && check(arr, i+1);
    }
}
