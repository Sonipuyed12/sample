package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args)
    {

        //add element by usind 1st add method
        //it implicitly add index position

        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println(list);
        list.set(0,"mahesh");//replace the value
        System.out.println(list);


        //here we can add heterogeneous element

        ArrayList list1 = new ArrayList<>();

        list1.add("hii");
        list1.add(1);
        list1.add('c');
        list1.add(22.2);

        System.out.println(list1);



       //add(int index,object o)


        ArrayList list2 = new ArrayList<>();

        list2.add(0,"hii");
        list2.add(1,1);
        list2.add(2,'c');
        list2.add(3,22.2);

        System.out.println(list2);




        //addAll()
        ArrayList al=new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);

        list2.addAll(al);
        System.out.println(list2);


        ArrayList al2 = new ArrayList<>();
        al2.add(1);
        al2.add(2);
        al2.add(4);
        al2.add(5);

        System.out.println(al2); //[1, 2, 4, 5]



        al2.add("aa");
        System.out.println(al2.add("aa"));//if we go throgh this way then we get true or false value

        System.out.println(al2);//[1, 2, 4, 5, aa]//if we go throgh this way then we get output like this way









    }
}
