package map;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();

        hm.put(1,"abc");
        hm.put(2,'c');
        hm.put(102,"10");
        hm.put(108,"sandeep");
        hm.put(101,"10.00");

        System.out.println(hm);


      //  hm.get(108);//return value of that key
        System.out.println(hm.get(108));

        //containsKey
       System.out.println(hm.containsKey(108));

       //containsValue
        System.out.println(hm.containsValue("sandeep"));


        //fetch keys
       Set s= hm.keySet();
        System.out.println(s);
        System.out.println(hm.keySet());

         //fetch values
        System.out.println(hm.values());

        hm.entrySet();
        System.out.println(hm);
        System.out.println(hm.entrySet());






        }





    }




