package Threadss;

public class Yield2 extends Thread{

    public void run()
    {
        for(int i=1;i<=5;i++)
        {
          //  Thread.yield();
            System.out.println("child Thread");
        }
    }

    public static void main(String[] args) {
        Yield2 y=new Yield2();
        y.start();
        Thread.yield();
        for(int i=1;i<=5;i++)
        {
        // ;
            System.out.println("parent Thread");
        }

    }
}
