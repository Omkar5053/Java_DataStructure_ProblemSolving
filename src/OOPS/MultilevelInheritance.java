package OOPS;

public class MultilevelInheritance {
    public static void main(String[] args)
    {
        Cat c = new Cat();
        c.eat();
        c.breathe();
        c.color = "black";
        c.breed = "Hybrid";
        c.legs = 4;
        c.sound();
    }
}

class Animals{
    String color;
    void eat()
    {
        System.out.println("Eating...");
    }
    void breathe(){
        System.out.println("Breathes.....");
    }
}
class Mammals extends Animals{
    int legs;
}
class Cat extends Mammals{
    String breed;
    void sound(){
        System.out.println("Mewoo..");
    }
}
