public class Exercise_1 {

    public static void main(String[] args)
    {
        int hari = 1;
        int kcal = 1700;
        int inc = 100;
        int k = 1;
        String dayName;

        

        for (hari = 1; hari <= 7; hari++ )
        {

             switch (hari)
            {
            case 1:
                dayName = "Monday";
                // kcal = 1700;
                break;
            case 2:
                dayName = "Tuesday";
                // kcal = kcal + 100;
                break;
            case 3:
                dayName = "Wednesday";
                // kcal = kcal + 100;
                break;
            case 4:
                dayName = "Thursday";
                // kcal = kcal + 100;
                break;
            case 5:
                dayName = "Friday";
                // kcal = kcal + 100;
                break;
            case 6:
                dayName = "Saturday";
                // kcal = kcal + 100;
                break;
            case 7:
                dayName = "Sunday";
                // kcal = kcal + 100;
                break;
            
            default:
                dayName = "Invalid Value";
                break;
            }
            
            if (hari >=3)
            {
                kcal += 100;
            }

            System.out.println(dayName);
            System.out.println(kcal);
            
             
        }
    }
}
