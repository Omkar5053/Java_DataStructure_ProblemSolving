package practice;

import java.util.ArrayList;

public class Dice {
    public static void main(String []args)
    {
        printDice("",4);
    }
    private static void printDice(String p, int target)
    {
        if(target == 0)
        {
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++)
        {
            printDice(p + i,target-i);
        }
    }

    private static ArrayList<String> printDiceArray(String p, int target)
    {
        if(target == 0)
        {
           ArrayList<String> list = new ArrayList<String>();
           list.add(p);
           return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 1; i <= 6 && i <= target; i++)
        {
            ans.addAll(printDiceArray(p + i,target-i));
        }
        return ans;
    }

    private static void printDiceWithDifferentFace(String p, int target, int face)
    {
        if(target == 0)
        {
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= face && i <= target; i++)
        {
            printDiceWithDifferentFace(p + i,target-i,face);
        }
    }
}
