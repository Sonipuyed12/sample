package lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class ConvertStringUppertoLower {
    public static void main(String[] args) {

      //  Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
//        String s="SONI";
//        System.out.println(s.toLowerCase());

        //create a string list
        List<String>list= Arrays.asList("soni","suji","vidhi","anki","vidhya");

          //convert into uppercase
            //here call replaceAll method of string class and then declare one varibale perform operation
              list.replaceAll(list1 -> list1.toUpperCase());

               for (String str:list)
               {
                   System.out.println(str);
               }


               ///convert into lowercase

        list.replaceAll(list2->list2.toLowerCase());
               for (String str1:list)
               {
                   System.out.println(str1);
               }


    }
}
