package stream;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {

        Set<Integer>set=new HashSet<>();
        set.add(10);
        set.add(19);
        set.add(101);
        set.add(198);
        set.add(178);
        set.add(196);
        set.add(196);


        Set<Integer> set1 = set.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toSet());
        System.out.println(set1);

    }
}
