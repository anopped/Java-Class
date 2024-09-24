public class Test {
    
    public static void main (String[] args)
    {
        // int[][] matrix = new int[5][3];

        // matrix[0][0] = 10;  matrix[0][1] = 20;   matrix[0][2] = 38;
        // matrix[1][0] = 50;  matrix[1][1] = 60;   matrix[1][2] = 76;
        // matrix[2][0] = 90;  matrix[2][1] = 100;  matrix[2][2] = 11;
        // matrix[3][0] = 50;  matrix[1][1] = 60;   matrix[1][2] = 71;
        // matrix[4][0] = 90;  matrix[2][1] = 10;  matrix[2][2] = 14;


        int[] math = new int[5];// {10, 50, 90, 50, 40};

        math[0] = 10;
        math[1] = 50;
        math[2] = 90;
        math[3] = 50;
        math[4] = 40;


        int[] science = new int[5]; // {20, 60, 100, 60, 10};

        science[0] = 20;
        science[1] = 60;
        science[2] = 100;
        science[3] = 60;
        science[4] = 10;

    
        int[] english = new int[5]; // {38, 76, 11, 71, 14};

        english[0] = 38;
        english[1] = 76;
        english[2] = 11;
        english[3] = 71;
        english[4] = 14;


        for (int i = 0; i< math.length; i++ )
        {
            int aveScore = (math[i] + science[i] + english[i]) / 3;

            System.out.println("My score is " + aveScore);
        }



        // int[][] numbers = 
        // {
        //     {13,23,33,43},{53,63,73,83},{93,103,113,123}
        // };

        // for (int row=0; row<matrix.length; row++)
        // {
        //     for(int col=0; col<matrix[row].length; col++)
        //     {
        //         System.out.println(matrix[row][col]);
        //     }
        // }

        // for (int[] number: numbers)
        // {
        //     for (int value: number)
        //     {
        //         System.out.println(value);
        //     }
        // }
    }
    

}
