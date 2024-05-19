package basicprogram;

public class Swap {
    public static void main(String[] args) {

        String s="test";
        String s1="best";
//        String s2;
//        s2=s;
//        s=s1;
//        s1=s2;
//
//        System.out.println(s);
//        //System.out.println(s1);


        s=s+s1;//testbest

        s1=s.substring(0,s.length()-s1.length());//8-4;test-best=test
        s=s.substring(s1.length());//4 tak skip karega

        System.out.println(s);
        System.out.println(s1);


    }
}
