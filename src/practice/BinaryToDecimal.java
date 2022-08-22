package practice;

public class BinaryToDecimal {
    public static void main(String args[])
    {
        System.out.println(convert(101));
    }

    private static int convert(int num)
    {
        int pow = 0;
        int decimal = 0;
        while(num!=0)
        {
            decimal = decimal + (num%10)*(int)Math.pow(2,pow);
            num = num / 10;
            pow++;
        }
        return decimal;
    }
}
