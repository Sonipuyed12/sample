package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortListRev {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(10,30,2,1,76,95,56);

        //sort in accending order
        //natural sorting
        List<Integer> lm = list.stream().sorted().collect(Collectors.toList());//if you want list back then use tolist
        System.out.println(lm);


        //2nd way
        list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);


        //sort list in decending order
        //1st way
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        //2nd way

        List<Integer> lm1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(lm1);

    }
}
