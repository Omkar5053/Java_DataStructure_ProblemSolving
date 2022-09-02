package Recursion;

public class FindPowOfN {
    public static void main(String[] args)
    {
        int num = 4;
        int pow = 3;
        System.out.println(getPow(num, pow));
    }
    private static int getPow(int num, int pow)
    {
        if(pow == 0)
        {
            return 1;
        }
        int halfPower = getPow(num, pow/2);
        int ans = halfPower * halfPower;
        if(pow % 2 != 0)
        {
            ans = ans * num;
        }
        return ans;
    }
}
