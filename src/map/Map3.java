package map;
import java.util.HashMap;
import java.util.Map;
public class Map3 {
    public static void main(String[] args) {

       Map map1 = new HashMap<>();
       Map map2 = new HashMap<>();

       map1.put("soni", 1);
        map1.put("vidhya", 2);
        map1.put("sujata", 3);

        System.out.println("map1: "+map1);

        map2.put("ankita",4);
        map2.put("neha",5);
        map1.put("shraddha", 6);

        System.out.println("map 2: "+map2);

        map2.putAll(map1);
        System.out.println(map2);





        Map m3=new HashMap();

        m3.put(1,100);
        m3.put(2,300);
        m3.put(3,455);

        System.out.println(m3);

        Map m4=new HashMap();

        m4.put(1,000);
        m4.put(2,1000);
        m4.put(3,5000);

       m3.putAll(m4);
       System.out.println(m4);





    }

}
