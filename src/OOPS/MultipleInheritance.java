package OOPS;

public class MultipleInheritance {
    public static  void main(String[] args)
    {
        Beer b = new Beer();
        b.eatVeg();
        b.eatNonVeg();
    }
}
interface Herbivore{
    void eatVeg();
}
interface Carnivore{
    void eatNonVeg();
}
class Beer implements Herbivore, Carnivore{

    @Override
    public void eatVeg()
    {
        System.out.println("eating..");
    }

    @Override
    public void eatNonVeg() {
        System.out.println("Eating....");
    }
}
