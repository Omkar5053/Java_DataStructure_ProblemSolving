package Arrays;

public class FindMinAndMax {
     public static void main(String[] args)
     {
         int arr[] = {1,5,8,9,34};
         findMinAndMax(arr);
     }
     private static void findMinAndMax(int[] arr)
     {
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;

         for(int i = 0; i<arr.length; i++)
         {
             if(arr[i]>max)
             {
                 max = arr[i];
             }
             if(arr[i]<min)
             {
                 min = arr[i];
             }
         }
         System.out.println("Maximum number "+max);
         System.out.println("Minimum number "+min);
     }
}
