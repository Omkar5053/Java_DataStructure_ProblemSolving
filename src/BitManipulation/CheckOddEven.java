package BitManipulation;

public class CheckOddEven {
    public static void main(String[] args)
    {
        int num = 13;
        int bitMask = 1;

        if((num & bitMask) == 0)
        {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
