package practice;

import java.util.ArrayList;

public class KeyPad {
    public static void main(String []args)
    {
        printsubseq("","12");
        //System.out.println(printsubseqArray("","12"));
    }
    private static void printsubseq(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for(int i = (digit-1)*3; i < digit*3; i++)
        {
            char ch = (char)('a' + i);
            printsubseq(p+ch,up.substring(1));
        }
    }

    private static ArrayList<String> printsubseqArray(String p, String up)
    {
        if(up.isEmpty())
        {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i = (digit-1)*3; i < digit*3; i++)
        {
            char ch = (char)('a' + i);
            ans.addAll(printsubseqArray(p+ch,up.substring(1)));
        }
        return ans;
    }
}
