package Arrays;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        //int[] arr = {1,2,3,4};

        int size;
        System.out.println("Enter the size of array: ");
        Scanner sc  = new Scanner(System.in);
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your "+size+" elements: ");
        for(int i = 0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        //reverse(arr);
        reverseRec(arr,0,arr.length-1);
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
     }
     private static void reverse(int[] arr)
     {
         int start = 0;
         int end = arr.length-1;
         while(start<=end)
         {
             int temp = arr[end];
             arr[end] = arr[start];
             arr[start] = temp;
             start++;
             end--;
         }
     }
     private static void reverseRec(int[] arr, int s, int e)
     {
         if(e<=s)
             return;
         int temp = arr[e];
         arr[e] = arr[s];
         arr[s] = temp;
         reverseRec(arr,s+1,e-1);
     }
}
