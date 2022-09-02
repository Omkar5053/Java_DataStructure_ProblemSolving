package BitManipulation;

public class ClearBitsInRange {
    public static void main(String[] args)
    {
        int num = 10;
        int i = 2;
        int j = 4;
        System.out.println(clearBitsInRange(num, i, j));
    }
    private static int clearBitsInRange(int num, int i, int j)
    {
        int a = (~0) << j+1;
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return num & bitMask;
    }
}
