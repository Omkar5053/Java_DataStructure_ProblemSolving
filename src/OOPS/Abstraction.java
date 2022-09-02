package OOPS;

public class Abstraction {
    public static void main(String[] args)
    {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.chnageColor();
    }
}
abstract class Animal4{
    String color;
    Animal4(){
        color = "Black";
    }

    void eat(){
        System.out.println("Eating...");
    }
    abstract void walk();
}

class Horse extends Animal4{
    void chnageColor(){
        color = "brown";
    }
    void walk()
    {
        System.out.println("Walk on four legs");
    }
}
