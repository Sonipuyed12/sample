package collection;

import java.util.LinkedList;

public class linkedList1 {
    public static void main(String[] args) {

        LinkedList l=new LinkedList();


        //it can store multiple null value,heterogeneous data
        //fallowas intersition order
        l.add("soni");
        l.add("moni");
        l.add(10);
        l.add(10.0);
        l.add(null);
        l.add(null);
        l.add(null);
        l.add("soni");
        l.add(8,"rani");

        System.out.println(l);



        LinkedList l1=new LinkedList();

        //it doest fallow sorting as u insert element it give output as it is
        l1.add(204);
        l1.add(20);
        l1.add(15);
        l1.add(74);

        System.out.println(l1);


    }
}
