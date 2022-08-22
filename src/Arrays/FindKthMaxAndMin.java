package Arrays;

import java.util.Scanner;

public class FindKthMaxAndMin {
    public static void main(String[] args)
    {
        int arr[] = {2, 4, 1, 5, 8, 9};
        insertionSort(arr);
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Enter your max choice ");
        Scanner sc  = new Scanner(System.in);
        int max = sc.nextInt();
        System.out.println(getMax(arr,max));

        System.out.println("Enter your min choice ");
        int min = sc.nextInt();
        System.out.println(getMin(arr,min));
    }

    private static int getMax(int[] arr, int max)
    {
        return arr[arr.length-max];
    }

    private static int getMin(int[] arr, int min)
    {
        return arr[min-1];
    }

    private static void insertionSort(int[] arr)
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = i+1; j>0; j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
