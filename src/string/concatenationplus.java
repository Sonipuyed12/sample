package string;

public class concatenationplus {
    public static void main(String[] args) {

        //heere first two object are created
        String s="soni";
        String s2="puyed";

        ///then 3rd object is created
        System.out.println(s+" "+s2+" ");


        //if you make any changes on old obj then new object will created old will be as it is
        System.out.println(s+10);//soni10
       System.out.println(10+s);//10soni

       System.out.println(s+10+20); //soni1020
       System.out.println(10+20+s);//30soni


    }
}
