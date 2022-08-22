package practice;

import java.util.Arrays;
import java.util.Scanner;

//Two words are said to be anagrams, if both the words contain same set of characters with
//all originals letters exactly once.
// ARMY  --  MARY
public class Anagram {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();

        if(first.length() == second.length())
        {
            char [] firstString = first.toCharArray();
            char [] SecondString = second.toCharArray();
            Arrays.sort(firstString);
            Arrays.sort(SecondString);

            if(Arrays.toString(firstString).equalsIgnoreCase(Arrays.toString(SecondString)))
            {
                System.out.println("Anagram ");
            } else
            {
                System.out.println("Not Anagram");
            }
        }
        else
        {
            System.out.println("Not Anagram");
        }

    }
}
