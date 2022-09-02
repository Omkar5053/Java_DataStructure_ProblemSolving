package BitManipulation;

public class FastExponentiation {
    public static void main(String[] args)
    {
        int num = 5;
        int pow = 3;
        System.out.println(getExponentional(num, pow));
    }
    private static int getExponentional(int num, int pow)
    {
        int ans = 1;
        while(pow > 0)
        {
            if((pow & 1) != 0) //here we are checking our LSB that whether it is 1 or 0
            {
                ans = ans * num;
            }
            num = num * num;
            pow = pow >> 1;
        }
        return ans;
    }
}
