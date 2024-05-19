package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        //use alll methods

        LinkedList l=new LinkedList();

        l.add("soni");
        l.add("suji");
        l.add(10);
        l.add(19);
        l.add(12.9);
        l.add(null);
        l.add(null);
        System.out.println(l);

        //add(object obj)
        l.add(11);
        System.out.println(l);

        //add(int index,object obj)

        l.add(0,"vidhya");
        System.out.println(l);

       //addFirst(object o)
        l.addFirst(10);
        System.out.println(l);//[10, vidhya, soni, suji, 10, 19, 12.9, null, null, 11]

        //addLast(object o)

        l.addLast("shruti");
        System.out.println(l);//[10, vidhya, soni, suji, 10, 19, 12.9, null, null, 11, shruti]


        //l.addAll(collection c)

        //remove()
        l.remove("soni");
        System.out.println(l);//[10, vidhya, suji, 10, 19, 12.9, null, null, 11, shruti]

        //removeAll()

       // removeFirst()

        l.removeFirst();
        System.out.println(l);//[vidhya, suji, 10, 19, 12.9, null, null, 11, shruti]

        //rempveLast()

        l.removeLast();
        System.out.println(l);//[vidhya, suji, 10, 19, 12.9, null, null, 11]


        //claer()//it clear all linkedlist
//        l.clear();
//        System.out.println(l);

        //contains()
        System.out.println(l.contains("suji"));//true

        //isEmpty()
       System.out.println( l.isEmpty());

      //size()
       System.out.println(l.size());

       //itertaor
//       Iterator i =l.iterator();
//
//       while (i.hasNext())
//       {
//           System.out.println(i.next());
//       }




       //object get(int index)
       System.out.println(l.get(0));

       //getFirst()
       // l.getFirst(0);
        System.out.println(l.getFirst());

        //getLast()
        System.out.println(l.getLast());


       //set(int index)
        l.set(3,"madhura");//replace the element of index position 3
        System.out.println(l);

       //object remove(int index)
        System.out.println(l.remove(0));

        //int indexof(object obj)//return index of specified character
        System.out.println( l.indexOf("madhura"));

        //int lastIndexOf(Object o)
        System.out.println(l.lastIndexOf("vidhya"));















    }
}
