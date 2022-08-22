package Pattern;

public class PrintHollowRectangle {
    public static void main(String []args)
    {
        int rows = 5;
        //int cols = 4;
        //print(rows, cols);
        //printInvertedPiramid(rows);
        //printInvertedNumber(rows);
        //printFloydTraingle(rows);
        //Zero_One_Triangle(rows);
        //butterfly(rows);
        //solid_rombous(rows);
        //hollow_rombous(rows);
        //diamond(rows);
        //numberPiramid(rows);
        numberpalindrom(rows);

    }
    private static void print(int rows, int cols)
    {
        //outer loop for row
        for(int i = 1; i<=rows; i++)
        {
            //inner loop for col
            for(int j = 1; j<=cols; j++)
            {
                if(i == 1 || i == rows || j == 1 || j==cols)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printInvertedPiramid(int lines)
    {
        for(int i = 1; i<=lines; i++)
        {
            //for spaces
            for(int j = 1; j<=lines - i; j++)
            {
                System.out.print(" ");
            }
            //for stars
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void printInvertedNumber(int line)
    {
        for(int i = 1; i<=line; i++)
        {
            for(int j = 1; j<=line-i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void printFloydTraingle(int line)
    {
        int num = 1;
        for(int i = 1; i<=line; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    private static void Zero_One_Triangle(int line)
    {
        for(int i = 1; i<=line; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    private static void butterfly(int line)
    {
        //1st half
        for(int i = 1; i<=line; i++)
        {
            //star - i
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            //space 2*(line-i)
            for(int j = 1; j<=2*(line-i); j++)
            {
                System.out.print(" ");
            }
            //star -i
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = line; i>=1; i--)
        {
            //star - i
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            //space 2*(line-i)
            for(int j = 1; j<=2*(line-i); j++)
            {
                System.out.print(" ");
            }
            //star -i
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void solid_rombous(int line)
    {
        for(int i = 1; i<=line; i++)
        {
            //space
            for(int j = 1; j<=line-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=line; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void hollow_rombous(int line){
        for(int i = 1; i<=line; i++)
        {
            //spaces
            for(int j = 1; j<=line-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=line; j++)
            {
                if(i == 1 || i == line || j == 1 || j == line)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private static void diamond(int line)
    {
        //for first half
        for(int i = 1; i<=line; i++)
        {
            //for spaces
            for(int j = 1; j<=line-i; j++)
            {
                System.out.print(" ");
            }
            //for stars
            for(int j =1; j <= (2*i - 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //for second half
        for(int i = line; i>=1; i--)
        {
            //for spaces
            for(int j = 1; j<=line-i; j++)
            {
                System.out.print(" ");
            }
            //for stars
            for(int j =1; j <= (2*i - 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void numberPiramid(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void numberpalindrom(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            //spaces
            for(int j = 1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            //ascending
            for(int j = i; j>=1; j--)
            {
                System.out.print(j);
            }
            //descending
            for(int j = 2; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
