package cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {
    public static void main(String[] args) {

        //create vector object

        Vector v=new Vector();

        v.add(10);
        v.add("soni");
        v.add("shree");
        v.add(11.0);

        System.out.println(v);

        //we create the object of enumaration cursor using method of vector class element()

        Enumeration e= v.elements();

        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }




    }
}
