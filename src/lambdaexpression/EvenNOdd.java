package lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNOdd {
    public static void main(String[] args) {
        //take one list
        List<Integer>list= Arrays.asList(10,20,89,15,40);

        //find even number using lambda

      List<Integer> even= list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(even);


        //find oddd number using lambda

        List<Integer>odd=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(odd);






    }
}
