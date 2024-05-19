package map;
import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {

        Map m= new HashMap();

        m.put(1,"deepak");
        m.put(2,"vishal");
        m.put(3,"disha");
        m.put(4,null);
        m.put(null,null);
        m.put(null,"rushi");


        //it doesnt fallow sorting and intersition order

        //in the thre shiuld be one null velue
        //bt in values it can be multiple it doesnt affected
        //one will replace other
        System.out.println(m);//{null=rushi, 1=deepak, 2=vishal, 3=disha, 4=null}

        System.out.println(m);//{1=deepak, 2=vishal, 3=disha}

        //duplicate key are not allowed
        //if you make any duplicate key then it replace with new value
        m.put(1,"soni");
        System.out.println(m);//{1=soni, 2=vishal, 3=disha}
        m.put(1,11);
        System.out.println(m);//{1=11, 2=vishal, 3=disha}





        
    }
}
