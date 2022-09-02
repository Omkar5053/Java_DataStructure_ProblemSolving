package OOPS;

public class MethodOverridding {
    public static void main(String[] args)
    {
        Animal2 animal = new Deer();
        animal.eat();
    }
}
class Animal2{
    void eat()
    {
        System.out.println("Eat Anything..");
    }
}
class Deer extends Animal2{
    void eat()
    {
        System.out.println("Eat only Grass");
    }
}