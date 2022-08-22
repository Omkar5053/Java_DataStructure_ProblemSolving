package Arrays;

public class SpiralMatrix {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printSpiral(matrix);
    }

    private static void printSpiral(int[][] matrix)
    {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol)
        {
            //we will use j if column is variable and i if row is variable
            //for top
            for(int j = startCol; j<=endCol; j++)
            {
                System.out.print(matrix[startRow][j]+" ");
            }
            //for right
            for(int i = startRow + 1; i<=endRow; i++)
            {
                System.out.print(matrix[i][endCol]+" ");
            }
            //for bottom
            for(int j = endCol - 1; j>=startCol; j--)
            {
                if(startRow == endRow) // it is for not repeating elements if only one element left at the end in middle
                {                      // because already above that element will printed so we just break the loop
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //for left
            for(int i = endRow - 1; i>=startRow + 1; i--)
            {
                if(startCol == endCol)
                {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}
