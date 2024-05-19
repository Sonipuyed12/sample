package string;

public class Length1 {
    public static void main(String[] args) {

        String s="hello world";
        System.out.println(s.length());

        System.out.println();


        //startindex
        System.out.println(s.substring(7));//orld //start from 1st to 7 it will leave and then rest will print
        System.out.println(s.substring(0));//hello world


        //startindex and endindex

        System.out.println(s.substring(0,7));
        System.out.println(s.substring(5,7));//it will start from 5 that is it will leave 5 se aage tak print karega





    }
}
