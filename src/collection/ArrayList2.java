package collection;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        //remove()

//        ArrayList al = new ArrayList<>();
//
//        al.add(1);
//        al.add(2);
//        al.add(4);
//        al.add(5);
//        al.add("aaa");
//
//       // al.remove(5);//if we go through this way then we get IndexOutOfBoundsException
//        //because it consider as index which is not present thats why
//
//        al.remove(3);//index is present thats why it doesnt give any exception
//       System.out.println(al);
//
//       al.remove("aaa");//we can go this way can we can remove this type of object
//       System.out.println(al);
//
//
//        //removeAll()
//        //it is use to remove all matching element
//
//        ArrayList al2 = new ArrayList<>();
//
//        al2.add(1);
//        al2.add(2);
//        al2.add(4);
//        al2.add(5);
//
//        System.out.println(al2);//[1, 2, 4, 5]
//
//
//        ArrayList al3 = new ArrayList<>();
//
//        al3.add(1);
//        al3.add(5);
//        al3.add(4);
//        al3.add(6);
//
//        System.out.println(al3);//[1, 5, 4, 6]
//
//        al2.removeAll(al3);
//        System.out.println(al2);//[2]
//
//
//
//        //clear()
//
//        //it is use to  to clear all elementt from list
//
//
        ArrayList al4 = new ArrayList<>();

        al4.add(1);
        al4.add(2);
        al4.add(4);
        al4.add(5);
        al4.add("aaa");

//        al4.clear();
//        System.out.println(al4);










        ArrayList al5 = new ArrayList<>();

        al5.add(1);
        al5.add(2);
        al5.add(4);
        al5.add(5);
        al5.add("aaa");

        System.out.println(al5);//[1, 2, 4, 5, aaa]

        al5.remove("aaa");
        System.out.println(al5);//[1, 2, 4, 5]

        al5.remove(2);//index position 2 ka remove hoga
        System.out.println(al5);//[1, 2, 5]


        al5.clear();
        System.out.println(al5);

        al5.removeAll(al4);
        System.out.println(al5);//[]







    }
}
