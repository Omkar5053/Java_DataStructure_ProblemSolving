package BitManipulation;

public class checkPowerOf2 {
    public static void main(String[] args)
    {
        int num = 8;

        if(check(num))
        {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a power of 2");
        }
    }
    private static boolean check(int num)
    {
        return (num & (num-1)) == 0;
    }
}
