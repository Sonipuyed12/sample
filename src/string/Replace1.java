package string;

public class Replace1 {
    public static void main(String[] args) {
        String s="soni is very good girl and she is very cleaver";

        String s1="this is demo";

       // System.out.println(s.contains(" is very good girl"));


        //replace
       // System.out.println(s.replace("is","much"));

         //replaceAll()
        System.out.println(s.replaceAll("is","was"));
        System.out.println(s.replaceAll("is(.)","was"));//soni wasvery good girl and she wasvery cleaver

        System.out.println(s.replaceAll("is(.*)","was"));//soni was

        System.out.println(s1.replaceAll("is(.)","was"));//thwaswasdemo//remove space after the string


        //replacefirst
        //only once replace

        System.out.println(s.replaceFirst("is","was"));

    }
}
