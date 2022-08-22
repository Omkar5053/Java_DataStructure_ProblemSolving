package practice;

import java.util.Scanner;

public class Factorial {

    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number : ");
        num = sc.nextInt();
        System.out.print(factorial(num));
    }

    public static int factorial(int num){
        if(num == 0)
            return 1;
        return num*factorial(num-1);
    }
}
