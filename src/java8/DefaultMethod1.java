package java8;

interface Soni1
{
    //solve default problem

    //after java8 we can add default and static method in interface
    //just provide the implementation in interface
    default  void display()
    {
        System.out.println("soni");
    }
    static void show()
    {
        System.out.println("hiiiii");
    }
}

interface Moni
{
   // void show();
    default void display()
    {
        System.out.println("moni");
    }

}
public class DefaultMethod1 implements Soni1,Moni{
    public void display()
    {
       Soni1.super.display();
        System.out.println("soni");
    }

    public static void main(String[] args) {

        DefaultMethod1 d=new DefaultMethod1();
        d.display();

    }

}
