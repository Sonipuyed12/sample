package Threadss;

class Display
{
   public void wish(String name)
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("name");
            }
        }
    }
}
public class Synchronisation2 extends Thread {
    static Display  d;
    String name;
  public   void run()
    {
        d.wish(name);
    }

    public static void main(String[] args) {
        d=new Display();
        Synchronisation2 s=new Synchronisation2();

        s.name="soni";
        s.start();
        
        Synchronisation2 s1=new Synchronisation2();
        s1.name="moni";
       s1.start();


    }


}
