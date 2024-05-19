package demo;

public class MethodOverl {
    int add(int a,int b)
    {
        System.out.println(a+b);
        return a*b;
    }
    void add(long a,long b)
    {
        System.out.println("long arg method call");
    }
    public static void main(String[] args) {
        MethodOverl m=new MethodOverl();
        int a1 = m.add(10, 10);
        System.out.println(a1);



    }
}
