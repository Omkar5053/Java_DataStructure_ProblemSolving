package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class StringPermutation {
    public static void main(String[] args)
    {
        //printPer("","abc");
//        ArrayList<String> ans = printPerArray("","abc");
//        System.out.println(ans);
        System.out.println(printPerCount("","abcd")) ;
    }
    private static void printPer(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for(int i = 0; i<=p.length(); i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            printPer(f+ch+s, up.substring(1));
        }
    }

    private static ArrayList<String> printPerArray(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i<=p.length(); i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(printPerArray(f+ch+s, up.substring(1)));
        }
        return ans;
    }

    private static int printPerCount(String p, String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }
        char ch = up.charAt(0);

        int count  = 0;
        for(int i = 0; i<=p.length(); i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + printPerCount(f+ch+s, up.substring(1));
        }

        return count;
    }
}
