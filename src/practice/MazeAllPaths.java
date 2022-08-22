package practice;

import java.util.Arrays;

public class MazeAllPaths {
    public static void main(String[] args)
    {
        boolean[][] board  = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] path = new int[board.length][board[0].length];
        //Allpath("", board, 0, 0);
        AllpathInMatrix("",board,0,0,path,1);

    }

    private static void Allpath(String p, boolean[][] maze, int r, int c)
    {
        if(r == maze.length - 1 && c == maze[0].length - 1)
        {
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
        {
            return;
        }

        //mark as visited by marking that cell false
        maze[r][c] = false;

        if(r < maze.length - 1)
        {
            Allpath(p + 'D', maze,r+1, c);
        }
        if(c < maze[0].length - 1)
        {
            Allpath(p+ 'R', maze, r, c+1);
        }
        if(r > 0)
        {
            Allpath(p+ 'U', maze, r-1, c);
        }
        if(c > 0)
        {
            Allpath(p+ 'L', maze, r, c-1);
        }

        //during return or getting remove function call from stack mark as not visited
        //for the future function call by just restoring the previous state of cell by marking it true
        //that  is called backtracking
        maze[r][c] = true;
    }

    private static void AllpathInMatrix(String p, boolean[][] maze, int r, int c, int[][] path, int step)
    {
        if(r == maze.length - 1 && c == maze[0].length - 1)
        {
            path[r][c] = step;
            for(int[] ans : path)
            {
                System.out.println(Arrays.toString(ans));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c])
        {
            return;
        }

        //mark as visited by marking that cell false
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1)
        {
            AllpathInMatrix(p + 'D', maze,r+1, c, path, step + 1);
        }
        if(c < maze[0].length - 1)
        {
            AllpathInMatrix(p+ 'R', maze, r, c+1, path, step + 1);
        }
        if(r > 0)
        {
            AllpathInMatrix(p+ 'U', maze, r-1, c, path, step + 1);
        }
        if(c > 0)
        {
            AllpathInMatrix(p+ 'L', maze, r, c-1, path, step + 1);
        }

        //during return or getting remove function call from stack mark as not visited
        //for the future function call by just restoring the previous state of cell by marking it true
        //that  is called backtracking
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
