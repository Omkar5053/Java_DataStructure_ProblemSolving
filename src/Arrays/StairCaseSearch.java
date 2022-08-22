package Arrays;

//given 2-D array have to sorted row-wise and col-wise then we can only apply stair-case search
public class StairCaseSearch {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int key = 33;
        search(matrix, key);
    }

    private static boolean search(int[][] matrix, int key)
    {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row <= matrix.length -1 && col >= 0)
        {
            if(key == matrix[row][col])
            {
                System.out.println("The key found at ("+row+","+col+")");
                return true;
            }else if(key < matrix[row][col])
            {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found ");
        return false;
    }
}
