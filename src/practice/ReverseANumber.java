package practice;

import java.util.Scanner;

public class ReverseANumber {

    static int ans = 0;
    private static void reverse1(int num)
    {
        if(num == 0)
            return;
        ans = ans * 10 + num%10;
        reverse1(num/10);
    }

    private static int reverse2(int num)
    {
        int digits = (int)Math.log10(num) + 1;
        return helper(num, digits);
    }

    private static int helper(int num, int digits) {
        if(num%10 == num)
            return num;
        return num%10 * (int)Math.pow(10,digits-1) + helper(num/10, digits-1);
    }


    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        reverse1(num);
        System.out.println(ans);
        System.out.println(reverse2(num));
    }
}
