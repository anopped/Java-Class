
class Animal
{
    public void sound()
    {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal
{
    public void bark()
    {
        System.err.println("Dog Barks");
    }
}


public class Casting 
{
    public static void main (String[] args)
    {
    Animal myAnimal = new Dog();
    myAnimal.sound();

    if (myAnimal instanceof Dog)
    {
        Dog myDog = (Dog) myAnimal;
        myDog.bark();
    }
    }
}
