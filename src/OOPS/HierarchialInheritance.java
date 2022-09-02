package OOPS;

public class HierarchialInheritance {
    public static void main(String[] args)
    {
        Dog2 d = new Dog2();
        d.color = "Black";
        d.eat();
        d.loyal();
    }
}
class Animals3{
    String color;
    void eat()
    {
        System.out.println("Eating...");
    }
}

class Bird extends Animals3{
    void fly(){
        System.out.println("Can Fly");
    }
}
class Dog2 extends Animals3{
    void loyal()
    {
        System.out.println("Loyals");
    }
}
