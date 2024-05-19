package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMinThreeNumber {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(10,30,3,5,29,34);

        //min
        List<Integer> list1 = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(list1);

        //max
        List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(list2);



    }
}
