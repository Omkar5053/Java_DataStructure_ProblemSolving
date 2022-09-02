package Recursion;

public class TillingProblem {
    public static void main(String[] args)
    {
        int n = 2;
        System.out.println(getNoOfTotWays(n));
    }
    private static int getNoOfTotWays(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        //for vertical choice
        int vertical = getNoOfTotWays(n - 1);
        //for horizontal choice
        int horizontal = getNoOfTotWays(n - 2);
        //total ways
        return vertical + horizontal;
    }
}
