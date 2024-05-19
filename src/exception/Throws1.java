package exception;

public class Throws1
{

    public static void main(String[] args) throws InterruptedException
    {

     try
     {
         Thread.sleep(10000);
    }
     catch(InterruptedException i)
     {
         System.out.println("hello soni");
         //throw i;
     }

    }

}
