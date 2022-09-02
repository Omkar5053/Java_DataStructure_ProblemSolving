package BitManipulation;

public class GetithBit {
    public static void main(String[] args)
    {
        int num = 10;
        int i = 3;

        System.out.println(getithBit(num,i));
    }

    private static int getithBit(int num, int i)
    {
        int bitMask = 1 << i;

        if((num & bitMask) == 0)
        {
            return 0;
        } else {
            return 1;
        }
    }
}
