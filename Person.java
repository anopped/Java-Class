public class Person 
{
    private String name; // what is private 
    private int age;
    // private double gpa; //= (firstgpa + secondgpa + thirdgpa) / 3; // 
    private double firstgpa;
    private double secondgpa;
    private double thirdgpa;

    public Person(String name, int age, double firstgpa, double secondgpa, double thirdgpa) //
    {
        this.name = name; // what is "this"?
        this.age = age;
        // this.gpa = GPA;
        this.firstgpa = firstgpa;
        this.secondgpa = secondgpa;
        this.thirdgpa = thirdgpa;
    }

    public void displayDetails()
    {
        System.out.println("My name is:" + name);
        System.out.println("My age is:" + age);
        // System.out.println("My Semester 1 GPA is:" + firstgpa);
        // System.out.println("My Semester 2 GPA is:" + secondgpa);
        // System.out.println("My Semester 3 GPA is:" + thirdgpa);
        double gpa = (firstgpa + secondgpa + thirdgpa) / 3;
        System.out.println("My CGPA is:" + gpa);
    }


    public static void main(String[] args)
    {
          // 
        Person gg = new Person("Arif", 26, 3.67, 3.77, 3.10);
        // double gpa = (firstgpa + secondgpa + thirdgpa) / 3;
        //  System.out.println("My CGPA is:" + gpa);
        gg.displayDetails();
    }
}
