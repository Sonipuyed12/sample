package lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortString {
    public static void main(String[] args) {

        //5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.

        List<String> list= Arrays.asList("soni","moni","raj","vidhya","Dagadu");
//
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

//        for (String str:list)
//        {
//            System.out.println(str);
//        }

        //sorting by lambda expression
        //here srt1and srt2 take two varibale
       list.sort((str1,str2)->str1.compareTo(str2));

        for (String str:list)
        {
            System.out.println(str);
        }
    }
}
