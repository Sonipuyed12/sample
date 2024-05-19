package cursor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        HashMap m=new HashMap();

        m.put(1,"soni");
        m.put(6,"mahesh");
        m.put(7,"vidhya");
        m.put(9,"don");
        m.put(4,"ram");
        m.put(5,"rani");

        System.out.println(m);

//        Set<Integer> keySet = m.keySet();
//
//        List<Integer> list=new ArrayList<>();
//
//        Collections.sort(list);
//
//        for(Integer i,list)
//        {
//            System.out.println(i);
//        }


//
//        List<String> list = new ArrayList<>();
//        Collections.sort(list);
//        System.out.println(m);

         Set s=m.keySet();

         System.out.println(s);


        Collection<String> list = m.values();
        List<String> list1 = new ArrayList<>(list);
        Collections.sort(list1);

        System.out.println(list1);






    }
}
