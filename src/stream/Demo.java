package stream;

public class Demo {
    public void  m1(Object o)
    {
        System.out.println("helloo");
    }
    public void  m1(String s)
    {
        System.out.println("String method");
    }

    public static void main(String[] args) {
        Demo d=new Demo();
       d.m1(null);

    }
}
