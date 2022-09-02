package OOPS;

public class SingleInheritance {
    public static void main(String[] args)
    {
        Dog d  = new Dog();
        System.out.println(d.color);
        d.eat();
        d.bark();
    }
}

class Animal {
    String color = "Red";
    public void eat()
    {
        System.out.println("eating.");
    }
}

class Dog extends Animal {
    public void bark()
    {
        System.out.println("barking..");
    }
}