package practice;

import java.util.Scanner;

public class PowerOfN {

    public static void main(String [] args){
        int num;
        int pow;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        num = sc.nextInt();

        System.out.println("Enter the pow : ");
        pow = sc.nextInt();

        System.out.println(calculatepow(num,pow));

    }

    private static int calculatepow(int num, int pow) {

//        if(pow == 1)
//            return num;
//        return num * calculatepow(num,pow-1);

        int temp;

        if(pow == 0)
            return 1;

        temp = calculatepow(num,pow/2);
        if(pow%2 == 0)
            return temp*temp;
        return temp*temp*num;
    }
}
