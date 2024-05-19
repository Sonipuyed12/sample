package collection;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();

        al.add(50);
        al.add(60);
        al.add(null);
        al.add("moni");
        al.add("aaa");
        al.add('c');

        System.out.println(al);

        //get the value
        System.out.println(al.get(2));


        //set the value at perticular index position

        al.set(2,"soni");
        System.out.println(al);

        //get indexof specified character
        System.out.println(al.indexOf("soni"));//2










    }
}
