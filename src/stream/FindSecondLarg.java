package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLarg {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(10,8,39,9,87,89,890,98);

        //here fist we sorted stream in reverse then skip first element ten findfirst then get that element

        Integer list1 = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(list1);
    }
}
