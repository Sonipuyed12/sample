package cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();

        //add element/object in arraylist

        for(int i=0;i<=10;i++)
        {
            al.add(i);
        }
        System.out.println(al);

        //iterate/fetch element one by one

        //call iterator() method of Iterator interface
        //fetch element one bye one
//       Iterator itr=al.iterator();
//
//       while (itr.hasNext())  //this method checks whether next element present or not
//       {
//
//           System.out.println(itr.next());
//       }


         Iterator  itr1=al.iterator();

         while (itr1.hasNext())
         {
             Integer n=(Integer) itr1.next();

             if(n%2==0)
             {
                 System.out.println(n);
             }

             else
             {
                 itr1.remove();//if it is not even number then remove that elelement
             }
         }

         System.out.println(al);//[0, 2, 4, 6, 8, 10]









    }
}
