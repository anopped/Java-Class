public class DifferentScopes 
{
    int instanceVariable = 10;
    double instanceVariableDobule = 1.0;
    String instanceVariableString = "This is a string";

    static int instanceVariableStatic = 20;

    public void showLocalVariable()
    {
        String localStringVarialbes = "Finish";
        int localVariable = 30;
        System.out.println("My Local variable is : " + localVariable + "  " + localStringVarialbes);
    }

    public static void main (String[] args)
    {
        DifferentScopes example = new DifferentScopes();
        example.showLocalVariable();
        System.out.println("My Local variable is: " + example.instanceVariable + "  " + example.instanceVariableString);
    }
}