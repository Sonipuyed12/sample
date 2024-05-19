package lambdaexpression;

import java.util.function.BiFunction;

public class ConcateTwoString {
    public static void main(String[] args) {

        //concate two string
//        String s="soni";
//        String s1="puyed";
//        String result=s.concat(s1+" ");
//        System.out.println(result);

        //now by using lambda function

        BiFunction<String,String,String> biFunction = (str1, str2) -> str1+str2;//take two varibale  perform addition operation and then sore it in bifunction variable

        String s = "Soni";
        String s1 ="Puyyed";

      String result = biFunction.apply(s,s1);//here apply that in  two string
        System.out.println(result);

    }
}
