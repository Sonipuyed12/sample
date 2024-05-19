package lambdaexpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxNdMin {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(1,2,6,78,90,45,67,8);

     int max =  list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

        int max2 =  list.stream().max(Comparator.reverseOrder()).get();
        System.out.println(max);


        Integer min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);

        Integer min2 = list.stream().min(Comparator.reverseOrder()).get();
        System.out.println(min);


        Optional<Integer> max1 = list.stream().max((a, b) -> a.compareTo(b));//here we take two any variable and then it compare by using compareto methhod
        System.out.println(max1);


        Optional<Integer> min1 = list.stream().min((a, b) -> a.compareTo(b));
        System.out.println(min1);




    }
}
