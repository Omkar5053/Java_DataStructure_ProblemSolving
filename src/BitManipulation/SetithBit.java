package BitManipulation;

public class SetithBit {
    public static void main(String[] args)
    {
        int num = 10;
        int i = 2;

        System.out.println(setithBit(num, i));
    }

    private static int setithBit(int num, int i)
    {
        int bitMask = 1<<i;

        return num | bitMask;
    }
}
