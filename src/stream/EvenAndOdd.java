package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {
    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(57);
        list.add(89);
        list.add(11);
        list.add(49);
        list.add(98);
        list.add(23);
        list.add(78);


        //find even number using stream

//        for (Integer i:list)
//        {
//            if(i%2==0)
//
//            {
//                System.out.println(i);
//            }
//
//
//
//        }

        List<Integer> even =list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(even);




    }
}
