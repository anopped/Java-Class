class Gaji
{
    private String name;
    private double Salary;// = new double[5];
    private double totalSalary = 0.0;
    double HealthAllowance = (2400*12);
        double TransportAllowance = (500*12);
        double bonus = 0;
        double totalBonus = 0;

    public Gaji(String name, double Salary, double totalSalary)
    {
        this.name = name;
        this.Salary = Salary;
        this.totalSalary = totalSalary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return Salary;
    }

    public void setSalary(double Salary)
    {
        this.Salary = Salary;
    }

    public double gettotalSalary()
    {
        return totalSalary;
    }

    public void settotalSalary(double totalSalary)
    {
        this.totalSalary = totalSalary;
    }

    public double calculateBonus(){
        // double BaseSalary = 0;
        // double HealthAllowance = (2400*12);
        // double TransportAllowance = (500*12);
        // double bonus = 0;
        // double totalBonus = 0;
        // for(int i=0; i<Salary.length; i++){
            
            if(Salary<30000)
            {
                bonus = (0*Salary);
            }
            if(30000<Salary && Salary<50000)
            {
                bonus = (0.05 * Salary);
            }
            if(Salary>50000)
            {
                bonus = (0.1*Salary);
            }
            // totalSalary = HealthAllowance + TransportAllowance + Salary + bonus;
            totalBonus = Salary + bonus;
            return totalBonus;
        // }
        // totalSalary = HealthAllowance + TransportAllowance + totalBonus;
        // return totalSalary;
        // System.out.println("Health Allowance " + HealthAllowance);
        // System.out.println("Tranport Allowance " + TransportAllowance);
        // System.out.println("Total Bonus " + totalBonus);
        // System.out.println("Total Salary " + totalSalary);
    }

    public double calculateSalary()
    {
        totalSalary = HealthAllowance + TransportAllowance + calculateBonus();
        return totalSalary;
    }

    public void display()
    {
        System.out.println("Basic Salary " + Salary);
        System.out.println("Health Allowance " + HealthAllowance);
        System.out.println("Tranport Allowance " + TransportAllowance);
        System.out.println("Total Bonus " + calculateBonus());
        System.out.println("Total Salary " + calculateSalary());
        System.out.println(" ");
    }

}



public class EmployeeCatch {
    
    // private String name;
    // private double Salary;
    // private double
    public static void main(String[] args)
    {
    double[] Salary = {53000, 64000, 9000, 28000, 49000};

    String[] kuli =  {"Abuya", "Skibidi", "Tiphu Khuat", "Ahdib", "Lando"};

    Gaji[] uli = new Gaji[5];

    // Gaji Kuli = new Gaji(null, null, 0);

    for(int row=0; row<Salary.length; row++)
    {
        uli[row] = new Gaji(kuli[row], Salary[row], 5);
        // kuli[row].setSalary(Salary[row]);
        // // Kuli.setSalary(Salary[row]);
        // Kuli.setName(kuli[row]);

        System.out.println("Name: " + uli[row].getName());
        uli[row].display();
    }
       

    try
    {
        // int[] numbers = {1, 2, 3};
        System.out.println(kuli[6]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Caught bad " + e.getMessage());
    }
    finally
    {
        System.out.println("It will continue anyway");
    }
    //contoh cam nk booking tpi ade org lain nk book jugak dlm masa yang same
    System.out.println("The program is continuing");

}

}
