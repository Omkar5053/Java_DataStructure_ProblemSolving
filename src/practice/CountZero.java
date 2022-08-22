package practice;

public class CountZero {
    public static void main(String[] args)
    {
        System.out.println(Counts(120004002,0));
    }

    private static int Counts(int num,int c)
    {
        if(num == 0)
            return c;
        int rem = num % 10;

        if(rem == 0)
            return Counts(num/10,c+1);
        return Counts(num/10,c);
    }
}
