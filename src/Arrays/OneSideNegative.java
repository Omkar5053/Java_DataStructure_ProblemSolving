package Arrays;

public class OneSideNegative {
    public static void main(String[] args)
    {
        int arr[] = {-1, -11, -2, 4, 5, -6, -3, 56};

        doOneSide(arr);
        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i]+ " ");
    }
    private static void doOneSide(int[] arr)
    {
        int j = 0; //it will track the recent positive number with whom swapping will happen

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
