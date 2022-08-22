package practice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String [] args)
    {
        Scanner sc  = new Scanner(System.in);
        int num  = sc.nextInt();
        System.out.println(sumOf(num));
    }

    private static int sumOf(int num)
    {
       /* int sum = 0;
      while(num>0)
      {
          sum = sum + num%10;
          num = num / 10;
      }

      return sum;*/

        if(num == 0)
            return 0;
        return (num%10) + sumOf(num/10);
    }
}
