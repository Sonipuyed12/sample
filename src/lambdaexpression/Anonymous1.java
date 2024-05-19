package lambdaexpression;
interface Soni
{
    void display();
}
public class Anonymous1 {
    void test()
    {
        Soni s=new Soni()
        {
            @Override
            public void display()
            {
                System.out.println("hello soni");
            }
        };
        s.display();

    }

    public static void main(String[] args)
    {
        Anonymous1 a=new Anonymous1();
        a.test();
    }

}
