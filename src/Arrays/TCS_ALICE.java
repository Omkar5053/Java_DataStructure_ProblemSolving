package Arrays;

import java.util.Scanner;

public class TCS_ALICE {
    public static void main(String[] args)
    {
        int N;
        System.out.println("Enter the no of Alice's Friends ");
        Scanner sc  = new Scanner(System.in);
        N = sc.nextInt();

        int[] D = new int[N];
        System.out.println("Enter the Digits Understand by each friend ");

        for(int i = 0; i<N; i++)
        {
            D[i] = sc.nextInt();
        }

        System.out.println(countOutput(D));
    }

    private static int countOutput(int[] D)
    {
        int count = 0;
        boolean flag = false;

        for(int i = 0; i<D.length-1; i++)
        {
            if(D[i+1] != D[i])
            {
                count++;
                flag = true;
            }
        }
        if(flag)
            return count+1;
        else
            return count;
    }
}
