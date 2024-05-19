package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperLower {
    public static void main(String[] args) {

        List<String>list= Arrays.asList("soni","suji","onkar","vidhi","chakru");

        //return list as it is
        List<String> list4 = list.stream().collect(Collectors.toList());
        System.out.println(list4);//[soni, suji, onkar, vidhi, chakru]

        //2nd way to return string
        list.stream().collect(Collectors.toList()).forEach(System.out::println);

        //uppercase
        List<String> list1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list1);//[SONI, SUJI, ONKAR, VIDHI, CHAKRU]

        //lowercase

        List<String> list3 = list.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(list3);//[soni, suji, onkar, vidhi, chakru]

        //find length of each string
        list.stream().map(String::length).collect(Collectors.toList()).forEach(System.out::println);


        ////find length of each string 2nd way
        List<Integer> list2 = list.stream().map(String::length).collect(Collectors.toList());
        System.out.println(list2);//[4, 4, 5, 5, 6]



    }
}
