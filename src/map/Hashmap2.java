package map;

import java.util.HashMap;
import java.util.*;

public class Hashmap2 {
    public static void main(String[] args) {

        HashMap h=new HashMap();

        h.put(101,"soni");
        h.put(102,"rani");
        h.put(103,"shau");
        h.put(104,"don");

        h.put(105,"suji");


        System.out.println(h);
        //convert into set
       Set s=h.entrySet();
       System.out.println(s);

       //fetch the value one by one
       Iterator itr=s.iterator();
       while (itr.hasNext())
       {
           System.out.println(itr.next());
       }

       //noe i want to change the key value

        Iterator itr1=s.iterator();
        while (itr1.hasNext())
        {
           //go inse the map then entry
            //because entry present insid`e the map

            Map.Entry m1=(Map.Entry)itr1.next();//put the element inside the map

            System.out.println(m1.getKey()+" "+m1.getValue());

            if(m1.getKey().equals(101))
            {
                m1.setValue("mahesh");
            }

           // System.out.println(itr1.next());
        }


        System.out.println(h);


    }
}
