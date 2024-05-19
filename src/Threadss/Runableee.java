package Threadss;

public class Runableee extends Thread {
    public void run()
    {
        System.out.println("child class run method");
    }

    public static void main(String[] args) {
       Runableee r=new Runableee();
        Thread t=new Thread();
      //  Thread t=new Thread(r);
       // t.start();
        t.run();

        System.out.println("main thread");

    }

}
