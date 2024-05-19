package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CheckStartWith {
    public static void main(String[] args) {

        List<String>list= Arrays.asList("Soni", "Rani","Mona","Nitesh","Don");

        //conver lower case then sort then collect
        List<String>  lst= list.stream().map(s->s.toLowerCase()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(lst);

        //check name contains or not
        List<String> list1 = list.stream().filter(S-> S.contains("Rani")).collect(Collectors.toList());
        System.out.println(list1);
        list.stream().filter(s->s.contains("Rani")).forEach(System.out::println);
        
        //startwith
        List<String> list2 = list.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(list2);
    }
}
