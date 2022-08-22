package practice;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String args[]){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements : ");
        for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before reversing :  "+ Arrays.toString(arr));

        System.out.println("Array after reversing "+ Arrays.toString(reverse(arr ,0 , arr.length-1)));

    }

    private static int[] reverse(int[] arr, int s, int l){
        if(l<=s)
            return arr;

        int temp;
        temp = arr[s];
        arr[s] = arr[l];
        arr[l] = temp;

        return reverse(arr, s+1, l-1);
    }
}
