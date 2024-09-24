
//Super Class

class Animal
{
    public void sound()
    {
        System.out.println("Hop Hop");
    }
}

//-----------------------------//
//SubClass

class Dog extends Animal
{
    @Override // function dlm class tu sama

    public void sound()
    {
        System.out.println("Barking");
    }
}

class Cat extends Animal
{
    @Override

    public void sound()
    {
        System.out.println("Meow");
    }
}

public class Polymorphism 
{
    public static void main(String[] args)
    {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();
    
    }
}