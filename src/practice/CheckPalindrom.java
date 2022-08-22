package practice;

import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String args[]){
        String s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        s = sc.nextLine();

        //System.out.println(check(s));
        System.out.println(checkRecursion(0,s.length()-1,s));
    }

    private static boolean checkRecursion(int s, int l, String str) {
        if(l<=s)
            return true;

        if(str.charAt(s) != str.charAt(l))
            return false;

        return checkRecursion(s+1,l-1,str);
    }

//    private static boolean check(String s){
//        int a = 0;
//        int e = s.length()-1;
//
//        while(a!=e)
//        {
//            if(s.charAt(a) == s.charAt(e))
//            {
//                a+=1;
//                e-=1;
//            }else {
//                return false;
//            }
//        }
//        return true;
//    }
}
