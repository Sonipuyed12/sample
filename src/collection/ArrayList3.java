package collection;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {

        ArrayList al5 = new ArrayList<>();

        al5.add(1);
        al5.add(2);
        al5.add(4);
        al5.add(5);
        al5.add("aaa");

        al5.contains(2);
        System.out.println(al5.contains(2));//true
        System.out.println(al5.add("bbb"));//true

        System.out.println(al5);//[1, 2, 4, 5, aaa]


        //add duplicate  value,null value ,multiple data

        ArrayList al=new ArrayList();

        al.add(10);
        al.add(10);
        al.add(null);
        al.add(null);
        al.add("soni");

         System.out.println(al);//[10, 10, null, null, soni]

        //find the size
         System.out.println(al.size());//5

        //fetch the value
        System.out.println(al.get(2));

















    }

}
