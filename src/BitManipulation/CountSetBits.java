package BitManipulation;

public class CountSetBits {
    public static void main(String[] args)
    {
        int num = 10;
        System.out.println(countSetbits(num));
    }
    private static int countSetbits(int num)
    {
        int count = 0;
        while(num>0)
        {
            if((num & 1) != 0) //here we are checking our LSB that whether it is 1 or 0
            {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}
