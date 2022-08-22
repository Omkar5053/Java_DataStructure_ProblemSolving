package practice;

import java.util.ArrayList;

public class Maze {
    public static void main(String []args)
    {
        //System.out.println(countPossibleWays(3,3));
        //path("", 3, 3);
        //System.out.println(pathArray("",3,3));
        //System.out.println(pathArrayDiagonaly("",3,3));

        boolean[][] board  = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

        pathWithRestriction("", board, 0, 0);

    }
    private static int countPossibleWays(int r, int c)
    {
        if(r == 1 || c == 1)
        {
            return 1;
        }

        int left = countPossibleWays(r-1, c);
        int right = countPossibleWays(r, c -1);

        return left + right;
    }

    private static void path(String p, int r, int c)
    {
        if(r == 1 && c == 1)
        {
            System.out.println(p);
            return;
        }

        if(r>1)
        {
            path(p + 'D',r-1, c);
        }
        if(c>1)
        {
            path(p+ 'R', r, c-1);
        }
    }

    private static ArrayList<String> pathArray(String p, int r, int c)
    {
        if(r == 1 && c == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1)
        {
             ans.addAll(pathArray(p + 'D',r-1, c));
        }
        if(c>1)
        {
            ans.addAll(pathArray(p+ 'R', r, c-1));
        }
        return ans;
    }

    private static ArrayList<String> pathArrayDiagonaly(String p, int r, int c)
    {
        if(r == 1 && c == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1 && c>1)
        {
            ans.addAll(pathArrayDiagonaly(p + 'D',r-1, c-1));
        }

        if(r>1)
        {
            ans.addAll(pathArrayDiagonaly(p + 'V',r-1, c));
        }
        if(c>1)
        {
            ans.addAll(pathArrayDiagonaly(p+ 'H', r, c-1));
        }
        return ans;
    }

    private static void pathWithRestriction(String p, boolean[][] maze, int r, int c)
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

        if(r < maze.length - 1)
        {
            pathWithRestriction(p + 'D', maze,r+1, c);
        }
        if(c < maze[0].length - 1)
        {
            pathWithRestriction(p+ 'R', maze, r, c+1);
        }
    }
}
