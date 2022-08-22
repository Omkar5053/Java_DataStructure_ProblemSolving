package Arrays;

public class PrintSubArray {
    public static void main(String[] args)
    {
        int[] arr = {1, 4, 7, 9, 5, 2};

        for(int i = 0; i<arr.length; i++)
        {
            String temp= " ";
            for(int j = i; j<arr.length; j++)
            {
                temp = temp + arr[j];
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
}
