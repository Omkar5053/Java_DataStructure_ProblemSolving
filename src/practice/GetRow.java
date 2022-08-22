package practice;

public class GetRow {
    public static void main(String []args)
    {
        int num = 71;
        System.out.println(getRowCount(num));
    }
    private static int getRowCount(int num)
    {
        int i = 1;
        int count = 0;
        int sum = 0;

        while(true)
        {
            if(sum <= num)
            {
                if((num-sum) <= i)
                {
                    break;
                }
                sum = sum + i;
            }
            i++;
            count++;
        }
        return count;
    }
}
