package practice;

public class TwinNumbers {
    public static void main(String[] args)
    {
        int num = 912;
        System.out.println(getTwin(num));
    }

    private static int getTwin(int num)
    {
        int temp = num;

        while(!(num/10 == 0))
        {
             num = helper(num);
             temp = num;
        }
        return temp;
    }
    private static int helper(int num)
    {
        int sum = 0;
        while(num!=0)
        {
            sum = sum + num%10;
            num = num /10;
        }
        return sum;
    }
}
