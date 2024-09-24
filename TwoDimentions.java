public class TwoDimentions {

    public static void main (String[] args)
    {
        int[][] matrix = new int[3][4];

        matrix[0][0] = 1;matrix[0][1] = 2;matrix[0][2] = 3;matrix[0][3] = 4;
        matrix[1][1] = 5;matrix[1][1] = 6;matrix[1][2] = 7;matrix[1][3] = 8;
        matrix[2][1] = 9;matrix[2][1] = 10;matrix[2][2] = 11;matrix[2][3] = 12;

        int[][] numbers = 
        {
            {13,23,33,43},{53,63,73,83},{93,103,113,123}
        };

        for (int row=0; row<matrix.length; row++)
        {
            for(int col=0; col<matrix[row].length; col++)
            {
                System.out.println(matrix[row][col]);
            }
        }

        for (int[] number: numbers)
        {
            for (int value: number)
            {
                System.out.println(value);
            }
        }
    }
    
}
