import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compatable1 implements Comparable<Compatable1> {

    String name;
    String lastName;
   double salary;
   int age;

   public Compatable1(String name,String lastName,double Salary,int age)
   {
       this.name=name;
       this.lastName=lastName;
       this.salary= salary;
       this.age=age;
   }

    @Override
    public String toString() {
        return "Compatable1{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

    @Override
    public int compareTo(Compatable1  o) {
       // return  this.lastName.compareTo(o.lastName);
        return this.age-o.age;
    }
}


class Test
{
    public static void main(String[] args) {

        List l= new ArrayList<>();//if we go this way then it accept heterogeneous data

       // List<String> l=new ArrayList<>();// both way are correct if we go this way then it accept only srting type of data
                                            //heterogeneous data can not be accept
        //if we go this way to sorting a collection object which has String type of object then it will be done by implicitly bcoz
        //String class implements by default the comparable interface
        l.add("soni");
        l.add("raj");
        l.add("shau");
        l.add("suji");
        l.add("chakru");

//        System.out.println(l);//[Compatable1@1b6d3586, Compatable1@4554617c, Compatable1@74a14482, Compatable1@1540e19d]
//
//        Collections.sort(l);
//        System.out.println(l);  //op[chakru, raj, shau, soni, suji]





        //now we have to do custom sorting
        //suppose the employee name salary age etc on the basis of this information we have to sorting then we can go with this way

        List l2=new ArrayList<>();

        l2.add(new Compatable1("soni","puyed",120000,24));
        l2.add(new Compatable1("shau","jadhav",110000,28));
        l2.add(new Compatable1("sujii","jadhav",130000,25));
        l2.add(new Compatable1("chakru","karhale",140000,26));

     System.out.println(l2); //[Compatable1@1b6d3586, Compatable1@4554617c, Compatable1@74a14482, Compatable1@1540e19d]
                             //if we direct print l2 ref variable then it gives this result  which we cant understand
                             //so to avoid this we have to override tostring method of object clss
      //here  jvm get confuse on which basis to do sorting
        //so we need to override compareTo() method of comparable interface then do sorting
        //in compareTo method we sould provide the implementation on which basis we want sorting


        //Steps
        //1 implement comparable interface nad <>provide that class name in this bracket
        //override tostring marhod
        //override compareto method and provide implementstion in which basis you want sorting
        //bt at a time we can do on one of the basis sorting
        //suppose you want soring on the basis od name and lastname then it is not possible at a time


       Collections.sort(l2);
        System.out.println(l2);


    }
}
