package practice;

public class Test2 {
    public static void main(String[] args)
    {
        int a,b,c;
        a = 9;
        b = 5;
        c = b & a;

        System.out.println(c);
        if((b ^ a) < (b & a))
        {
            System.out.println(a);
        }
        System.out.println(a+b);
    }
}
