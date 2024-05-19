package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(57);
        list.add(89);
        list.add(11);
        list.add(49);
        list.add(98);
        list.add(23);
        list.add(78);
        list.add(78);
        list.add(49);


        //remove duplicate element from
        List<Integer> newlist = list.stream().distinct().collect(Collectors.toList());
        System.out.println(newlist);//[10, 57, 89, 11, 49, 98, 23, 78]


        //return count
        Long list1 = list.stream().distinct().collect(Collectors.counting());
        System.out.println(list1);//8
    }
}
