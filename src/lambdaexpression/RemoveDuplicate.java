package lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {

        //Write a Java program to implement a lambda expression to remove duplicates from a list of integers.

        List<Integer> list= Arrays.asList(10,34,67,89,60,78,10,34);
        //if you go this way then op gives like this
         list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
//        10
//        34
//        67
//        89
//        60
//        78


        //both way are correct

        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

      //op [10, 34, 67, 89, 60, 78]

//store unique element list

        List<Integer>numList= new ArrayList<>();
        //perform operation on stream and sore it new list that is numlist
        list.stream().distinct().forEach(numList::add);
        System.out.println(numList);
    }
}
