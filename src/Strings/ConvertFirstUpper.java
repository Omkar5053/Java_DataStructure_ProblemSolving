package Strings;

public class ConvertFirstUpper {
    public static void main(String[] args)
    {
        String str = "hi, i am omkar";  //output should be "Hi, I Am Omkar"
        convert(str);
    }

    private static void convert(String str)
    {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i = 1; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == ' ' && i<str.length()-1)
            {
                sb.append(ch);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else
            {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
