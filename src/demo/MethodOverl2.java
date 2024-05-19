package demo;

public class MethodOverl2 {
    void show(Object o)
    {
        System.out.println(1);

    }

    void show(String s)
    {
        System.out.println(2);
    }

    public static void main(String[] args) {

        MethodOverl2 m=new  MethodOverl2();
        m.show("abc");
    }
}
