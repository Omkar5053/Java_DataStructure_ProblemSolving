package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Omkar";
        String b = "Omkar";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Omkar");
        String name2 = new String("Omkar");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}
