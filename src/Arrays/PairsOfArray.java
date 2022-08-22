package Arrays;

public class PairsOfArray {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 6, 4, 3, 8};

        for(int i = 0; i<arr.length; i++)
        {
            //int start = i;
            for(int j = i; j<arr.length; j++)
            {
                //int end = j;
                for(int k = i; k<=j; k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
