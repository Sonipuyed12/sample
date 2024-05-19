package string;

public class Swap {
    public static void main(String[] args) {
        String s="test";
        String s1="best";

        String s2;

        s2=s;
        s=s1;
        s1=s2;

        System.out.println(s);
        System.out.println(s1);
    }
}
