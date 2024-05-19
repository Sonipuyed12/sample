package map;

import java.util.HashMap;
import java.util.Map;


public class Map1 {
    public static void main(String[] args) {

       // Map m=new HashMap();//we can write both way
      HashMap m = new HashMap();//
        m.put(1,"soni");
        m.put(2,"rani");
        m.put(3,"moni");
        m.put(4,110.9);

        m.put(5,null);




        System.out.println(m);


        //methods of map interface
        //object put(object key,object value)//we use put method to store object in map
        // m.put(4,110.9);

        //contains(object key)
        //it make sure key present or not in map
        System.out.println(m.containsKey(4));//true

        //contains(object value)
        //it make sure value present or not in map
        System.out.println(m.containsValue("moni"));//true
        System.out.println(m.containsValue("shau"));//false

        //object get(object key)
        //return value of that object key that is object value
        System.out.println(m.get(1));


        //object remove(object key)
       // m.remove(1);
        //delete entry(key and value=entry) of specified key
       // System.out.println(m);//{2=rani, 3=moni, 4=110.9}

        //if key is not present then it return null value
        System.out.println(m.remove(5));//null




       // m.clear();
        //clear all map
       // System.out.println(m);//{}



        //m.isEmpty();
        //it makesure is map is empty or not if it is empty then it return true otherwise it return false
        System.out.println(m.isEmpty());//false


          //set keyset()
//        m.keySet(1,11);
//        System.out.println( m.keySet(1));


        //object replace

        m.replace(1,"mahi");
        System.out.println(m);//{1=mahi, 2=rani, 3=moni, 4=110.9}

        //m.size();
        System.out.println(m.size());



















    }
}
