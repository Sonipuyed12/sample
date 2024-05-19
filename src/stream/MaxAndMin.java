package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxAndMin {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(0,1,5,6,85,89,440,583);

        //find max
        Integer max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

        //find min

        Integer min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);

        //accending
        List<Integer> list1 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
         System.out.println(list1);//[0, 1, 5, 6, 85, 89, 440, 583]


         //decending
        List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
         System.out.println(list2);//[583, 440, 89, 85, 6, 5, 1, 0]


        Integer list4 = list.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println(list4);


        Integer list5 = list.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println(list5);
    }
}
