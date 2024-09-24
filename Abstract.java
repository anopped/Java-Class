
abstract class Animal 
{
    public abstract void sound();
    
    public void sleep()
    {
        System.out.println("This animal is sleeping");
    }
}

class Dog extends Animal // Subclass dependent to Superclass
{
    @Override
    public void sound()
    {
        System.out.println("barking");
    }
}

public class Abstract {

    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.sleep();
        dog.sound();
    }
    
}
