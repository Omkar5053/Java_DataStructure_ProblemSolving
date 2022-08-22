package practice;

import java.util.Scanner;

public class Test {
    public static void main(String [] args)
    {
        //printfibonacci();
        printfibonaccibyRecursion(0, 1, 5);
    }

    private static void printfibonacci()
    {
        int n;
        int num1 = 0;
        int num2 = 1;
        int num3;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n = sc.nextInt();
        while(n > 0)
        {
            num3 = num1 + num2;
            System.out.printf(num3 + " ");
            num1 = num2;
            num2 = num3;
            n --;
        }
    }

    private static void printfibonaccibyRecursion(int num1, int num2, int size)
    {
        if(size == 0)
            return;

        int num3 = num1 + num2;
        System.out.printf(num3 + " ");
        printfibonaccibyRecursion(num2, num3, --size);
    }
}
