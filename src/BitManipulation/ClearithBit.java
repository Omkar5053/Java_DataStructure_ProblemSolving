package BitManipulation;

public class ClearithBit {
    public static void main(String[] args)
    {
        int num = 10;
        int i = 1;
        System.out.println(clearithBit(num, i));
    }
    private static int clearithBit(int num, int i)
    {
        int bitMask = ~(1<<i);
        return num & bitMask;
    }
}
