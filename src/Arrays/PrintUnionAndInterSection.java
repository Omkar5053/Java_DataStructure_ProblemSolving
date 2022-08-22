package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintUnionAndInterSection {
    public static void main(String[] args)
    {
        int size1;
        int size2;

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of 1st Array: ");
        size1 = sc.nextInt();
        int arr1[] = new int[size1];

        System.out.println("Enter your elements: ");
        for(int i = 0; i<size1; i++)
            arr1[i] = sc.nextInt();

        System.out.println("Enter the size of 2nd Array: ");
        size2 = sc.nextInt();
        int arr2[] = new int[size2];

        System.out.println("Enter your elements: ");
        for(int i = 0; i<size2; i++)
            arr2[i] = sc.nextInt();


        doUnionAndInterSection(arr1, arr2);
    }

    private static void doUnionAndInterSection(int[] arr1, int[] arr2)
    {
        Set<Integer> union = new HashSet<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        //union
        for(int i = 0; i<arr1.length; i++)
            union.add(arr1[i]);

        for(int i = 0; i<arr2.length; i++)
            union.add(arr2[i]);


        //intersection
        for(int i = 0; i<arr1.length; i++)
        {
            for(int j = 0; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                    intersection.add(arr1[i]);
            }
        }
            System.out.println(intersection.toString());
            System.out.println(union.toString());
    }
}
