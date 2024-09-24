public class Ex2 {

    private String car;
    private int fuel;

    public String getCar()
    {
        return car;
    }
    
    public void setCar(String car)
    {
        this.car = car;
    }

    public void setFuel(int fuel)
    {
        this.fuel = fuel;
    }

    public int getFuel()
    {
        return fuel;
    } 

    public static void main(String[] args)
    {
        Ex2 carfuel = new Ex2();



    String[][] car = new String[2][2];

        car[0][0] = "Hondew";car[0][1] = "AMG_ATOK";
        car[1][0] = "Toyote";car[1][1] = "HILUX";

    int[][] fuel = new int[2][2];

        fuel[0][0] = 12;fuel[0][1] = 11;
        fuel[1][0] = 10;fuel[1][1] = 14;

        // carfuel.setCar ("Toyota");
        // carfuel.setFuel

    
        for (int row=0; row<car.length; row++)
        {
            
            for(int col=0; col<car[row].length; col++)
            {
                carfuel.setCar (car[row][col]);
                carfuel.setFuel (fuel[row][col]);
                System.out.println(carfuel.getCar() + " " + carfuel.getFuel() + " liters per 100km ");
                // switch(col)
                // {
                //     case 0:
                //     carfuel.setCar (car[row][col]);
                //     carfuel.setFuel (fuel[row][col]);
                //     break;
                //     case 1:
                //     carfuel.setCar (car[row][col]);
                //     carfuel.setFuel (fuel[row][col]);
                //     break;
                //     case 2:
                //     carfuel.setCar (car[row][col]);
                //     carfuel.setFuel (fuel[row][col]);
                //     break;
                //     case 3:
                //     carfuel.setCar (car[row][col]);
                //     carfuel.setFuel (fuel[row][col]);
                //     break;
                    
                // }

                // System.out.println(car[row][col] + " " + fuel[row][col] + " liters per 100km ");
                
            }

            System.out.println(carfuel.getCar() + " " + carfuel.getFuel() + " liters per 100km ");
        }

    }    
}
