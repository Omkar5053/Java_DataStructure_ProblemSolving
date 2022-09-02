package practice;

public class Test2 {
    public static void main(String[] args)
    {
        System.out.println(getNo(45671));
    }
    private static int getNo(int num)
    {
        int temp = num;
        int ans = 0;
        int i = 0;
        while(temp > 0)
        {
            int n = temp%10;
            if(n%2 == 0)
            {
                n = n + 1;
            } else
            {
                n = n - 1;
            }
            ans = n * (int)Math.pow(10, i) + ans;
            i++;
            temp = temp / 10;
        }
        return ans;
    }
}
