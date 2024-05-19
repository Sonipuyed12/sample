package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSum {
    public static void main(String[] args)
    {
        List<Integer>list=Arrays.asList(10,30,56,78);

        //it get double of each element
        List<Integer> list1 = list.stream().sorted(Comparator.naturalOrder()).map(s -> s + s).collect(Collectors.toList());

        System.out.println(list1);

        //addition of all element
        int list2 = list.stream().sorted(Comparator.naturalOrder()).reduce(0, (a, b) -> a + b).intValue();
        System.out.println(list2);




    }
}
