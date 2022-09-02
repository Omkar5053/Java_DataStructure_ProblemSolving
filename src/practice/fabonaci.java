package practice;

import java.util.Scanner;
//0 1 1 2 3 5 8 13
public class fabonaci {
    public static void main(String [] args){
        int n;
        System.out.println("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if(n == 1 || n == 2)
            return 1;
        return fibo(n-1) + fibo(n-2);
    }
}
