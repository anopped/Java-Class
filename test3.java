import java.util.Scanner;

public class test3 {
    
    public static void main(String[] args)
    {
        // Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    
    
    for(int i=0; i<=5; i++)
    {
    
    
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    
    System.out.println("Name");
    String name = myObj.nextLine();  // Read user input
    
    System.out.println("enter 1st number");
    int firstnumber = myObj.nextInt();  // Read user input

    System.out.println("enter 2nd number");
    int secondnumber = myObj.nextInt();

    int total = firstnumber + secondnumber;

    // System.out.println(name + " Sum of " + firstnumber + " and " + secondnumber + " = " + total);  // Output user input

    }

    
    }

}
