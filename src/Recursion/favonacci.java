package Recursion;

import java.util.Scanner;

public class favonacci {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of n: ");
        Scanner sc  = new Scanner(System.in);
        n  = sc.nextInt();
        System.out.println(getfavnacatN(n));
    }

    private static int getfavnacatN(int n) {
        if(n<2)
        {
            return n;
        }
        return getfavnacatN(n-1) + getfavnacatN(n-2);
    }
}
