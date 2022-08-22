package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingInputSeparetedBySpace {
    public static void main(String[] args) throws IOException
    {
        int arr[] = new int[10];

        //first method by using BufferReader
        String[] strs;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers by separeted space ");

        strs = bf.readLine().split(" ");

        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = Integer.parseInt(strs[i]);
        }

        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i]+" ");


        //2nd method by using nextInt()
        System.out.println("Enter the elements ");
        Scanner sc  =  new Scanner(System.in);

        for(int i = 0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
