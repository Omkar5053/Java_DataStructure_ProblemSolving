package practice;
//153 = 1^3 + 5^3 + 3^3 (Armstrong number)
public class ArmStrong {
    public static void main(String [] args)
    {
        int number = 153;
        int original  = number;
        int sum = 0;
        while(number > 0)
        {
            sum  = sum + (int)Math.pow((number%10),3);
            number = number / 10;
        }
        if(sum == original)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
