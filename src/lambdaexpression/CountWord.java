package lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@FunctionalInterface
interface Soni3
{
    int countWords(String text);
}


public class CountWord {
    public static void main(String[] args) {



        String text="hello soni puyed";
        //use lambda expression
        //we have to calculate word thats why we use split method
        //if you dont use then it give each word count


        Soni3 sh = s -> s.split("\\s+").length;
       int ctr= sh.countWords(text);
       //System.out.println(ctr);


        //using stream calculate the word in the string

        List<String>list= Arrays.asList("hello","soni","puyed","sujata","jadhav","soni","sujata");

        long lm = list.stream().collect(Collectors.counting());
        System.out.println(lm);


        //remove duplicate element


        long lm1 = list.stream().distinct().collect(Collectors.counting());
        System.out.println(lm1);


        //search how many times same string is present

        Map<String, Long> lm2 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(lm2);






    }
}
