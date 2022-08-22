package Strings;

//input -- aaaabbbcccdde
//output -- a4b3c3d2e
public class Compression {
    public static void main(String[] args)
    {
        String str = "aaaabbbcccdde";
        doCompression(str);
    }
    private static void doCompression(String str)
    {
        int count;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            sb.append(ch);
            count = 0;
            while(str.charAt(i) == ch && i < str.length()-1)
            {
                count++;
                i++;
            }
            if(count>1)
            {
                sb.append(count);
                i--;
            }
        }
        System.out.println(sb.toString());
    }
}
