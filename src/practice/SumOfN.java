package practice;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();

        System.out.println(sum(n));

    }

    public static int sum(int n){

        if(n==1)
            return 1;
        return n + sum(n-1);
    }

}
