package practice;

import java.util.ArrayList;

public class SubSequenceString {
    public static void main(String[] args)
    {
       // printSequence("","abc");
        //System.out.println( printSequenceArray("","abc"));
        printSequenceAscii("","abc");
        System.out.println();
        System.out.println( printSequenceArrayAscii("","abc"));
    }

    private static void printSequence(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+" ");
            return;
        }

        char c = up.charAt(0);

        printSequence(p + c, up.substring(1));
        printSequence(p, up.substring(1));
    }

    private static ArrayList<String> printSequenceArray(String p, String up)
    {
        if(up.isEmpty())
        {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }

        char c = up.charAt(0);

        ArrayList<String> left = printSequenceArray(p + c, up.substring(1));
        ArrayList<String> right= printSequenceArray(p, up.substring(1));

        left.addAll(right);
        return  left;
    }


    private static void printSequenceAscii(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+" ");
            return;
        }

        char c = up.charAt(0);

        printSequenceAscii(p + c, up.substring(1));
        printSequenceAscii(p, up.substring(1));
        printSequenceAscii(p +(c + 0), up.substring(1));
    }

    private static ArrayList<String> printSequenceArrayAscii(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char c = up.charAt(0);

        ArrayList<String> first = printSequenceArrayAscii(p + c, up.substring(1));
        ArrayList<String> second= printSequenceArrayAscii(p, up.substring(1));
        ArrayList<String> third= printSequenceArrayAscii(p+(c+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return  first;
    }


}
