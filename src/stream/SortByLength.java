package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {
    public static void main(String[] args) {

        List<String>list= Arrays.asList("soni","sujata","payal","vikas","onkar","vikasssssss","onkarrnm");

        //sort string by length
        list.stream().map(String::length).sorted(Comparator.naturalOrder()).forEach(System.out::println);

        List<Integer> list3 = list.stream().map(s -> s.length()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
                System.out.println(list3);
        //sort reverseorder and get first

       String list1 = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(list1);

        //sort string
        List<String> list2 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
      System.out.println(list2);


        //sort natural order and get first
        String  s= list.stream().sorted(Comparator.naturalOrder()).skip(5).findFirst().get();
        System.out.println(s);






    }
}
