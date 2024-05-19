package java8;
interface Soni
{
    void show(String  s);
}

interface Rani
{
    void show( String s);

}
public class Interface1 implements Soni,Rani{

   public void show(String  s)
    {

        System.out.println("huu");
    }

//    public void show(String s)
//    {
//        System.out.println("rani");
//    }


    public static void main(String[] args) {

        Interface1 i=new Interface1();
        i.show("soni");

    }
}
