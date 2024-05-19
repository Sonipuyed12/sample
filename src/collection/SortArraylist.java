package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();

        al.add(10);
        al.add(0);
        al.add(7);
        al.add(1);
        al.add(6);

        System.out.println(al);
        Collections.sort(al);

        System.out.println(al);



    }
}
