package OOPS;

public class MethodOverloading {
    public static  void main(String[] args)
    {
        Calculator c = new Calculator();
        System.out.println(c.sum(12,13));
        System.out.println(c.sum(12,13, 15));
        System.out.println(c.sum(12.4f,13.0f));
    }
}
class Calculator{
    public int sum(int a, int b)
    {
        return a + b;
    }
    public int sum(int a, int b, int c)
    {
        return a + b + c;
    }
    public int sum(float a, float b){
        return (int)(a + b);
    }
}