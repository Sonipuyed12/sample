package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CalculateFreq {
    public static void main(String[] args) {

//    count how much string /element present in given list
        List<String>list= Arrays.asList("soni","suji","payal","vikas","onkar","vikas","onkar");

        //give the number of element present in the list
        Long list1 = list.stream().collect(Collectors.counting());
        System.out.println(list1);

        //give whole list
        System.out.println( list.stream().collect(Collectors.toList()));

        //calulate duplicate
        List<String> list2 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list2);//[soni, suji, payal, vikas, onkar]

        //count the
        Long list4 = list.stream().distinct().collect(Collectors.counting());
        System.out.println(list4);//5

        //count same element
        Map<String, Long> list3 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         System.out.println(list3);//{onkar=2, soni=1, suji=1, vikas=2, payal=1}
    }
}
