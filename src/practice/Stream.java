package practice;

public class Stream {
    public static void main(String[] args)
    {
        remove("","baccadh");
        System.out.println(remove2("baccadh"));
        System.out.println(skipString("bccadappledh"));
        System.out.println(skipappNotapple("bccadappedh"));
    }

    private static void remove(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        if(c == 'a')
        {
            remove(p, up.substring(1));
        } else{
            remove(p + c, up.substring(1));
        }
    }

    private static String remove2(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }

        char c = s.charAt(0);
        if(c == 'a')
        {
           return remove2(s.substring(1));
        } else{
           return c + remove2(s.substring(1));
        }
    }

    private static String skipString(String s)
    {
        if(s.isEmpty())
            return "";
        if(s.startsWith("apple"))
        {
            return skipString(s.substring(5));
        } else{
            return s.charAt(0) + skipString(s.substring(1));
        }


    }

    private static String skipappNotapple(String s)
    {
        if(s.isEmpty())
            return "";
        if(s.startsWith("app") && !s.startsWith("apple"))
        {
            return skipappNotapple(s.substring(3));
        } else{
            return s.charAt(0) + skipappNotapple(s.substring(1));
        }


    }
}
