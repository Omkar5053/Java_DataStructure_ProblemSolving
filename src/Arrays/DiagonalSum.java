package Arrays;

public class DiagonalSum {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(getDiagonalSum(matrix));
    }
    private static int getDiagonalSum(int[][] matrix)
    {
        int sum = 0;

        //brute force solution --- time complexity = 0(n^2)
//        for(int i = 0; i<matrix.length; i++)
//        {
//            for(int j = 0; j<matrix[0].length; j++)
//            {
//                //for primary diagonal
//                if(i == j)
//                {
//                    sum += matrix[i][j];
//                }
//                else if(i + j == matrix.length - 1) //for secondary diagonal
//                {
//                    sum += matrix[i][j];
//                }
//            }
//        }

        //optimized solution -- time complexity = 0(n)
        for(int i = 0; i<matrix.length; i++)
        {
            //for primary diagonal
            sum += matrix[i][i];

            //for secondary diagonal
            if(i != matrix.length - i - 1)
                sum += matrix[i][matrix.length - i - 1];
        }
        return sum;
    }
}
