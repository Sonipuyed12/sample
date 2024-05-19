package stream;

import java.util.Arrays;
import java.util.List;

public class MultiplyBy5 {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(1,2,45,67,90,44,56);
        list.stream().filter(i->i%5==0).forEach(System.out::println);
    }
}
