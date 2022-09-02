package BitManipulation;

public class CleariBit {
    public static void main(String[] args)
    {
        int num = 15;
        int i = 2;
        System.out.println(cleariBit(num, i));
    }
    private static int cleariBit(int num, int i)
    {
        int bitMask = (~0) << i;  // or, (-1)<<i
        return num & bitMask;
    }
}
