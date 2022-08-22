package Strings;

import java.util.Arrays;

public class SubLength {
    public static void main(String[] args) {
        String s = "aabbccc";
        getLengthOfSub(s);
    }

    private static void getLengthOfSub(String s) {
        char [] ch = s.toCharArray();
        String res = "";
        for(int i = 0;i<s.length()-1; i++)
        {
            if(ch[i]==ch[i+1])
            {

            }
            res = res + ch[i];
        }
        System.out.println(res);
  }
}
