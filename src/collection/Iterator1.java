package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add("soni");
        al.add("moni");
        al.add(19);
        al.add('v');
        al.add(20);

        System.out.println(al);

        Iterator i=al.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
