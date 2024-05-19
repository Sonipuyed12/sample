package demo;
class Soni
{
    int a=10;
    String color="white";
    void show()
    {
        System.out.println("hello");
    }
}
public class Overriding1 extends Soni {

    void show()
    {
        System.out.println("bye");
    }
    public static void main(String[] args) {

        Soni s=new Overriding1();
        s.show();
        Soni s1=new Soni();
        s1.show();
         Overriding1 s3= new Overriding1();
         s3.show();

    }


}
