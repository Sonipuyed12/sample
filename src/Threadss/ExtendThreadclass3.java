package Threadss;

public class ExtendThreadclass3 extends Thread {

    public void start()//if we override  start method then it will work like normal method new thread will not create
    {                  //run method will not execute implicitly
        System.out.println("start method");
    }
    public void run()
    {
        System.out.println("run method");
    }

    public static void main(String[] args) {
        ExtendThreadclass3 e1=new ExtendThreadclass3();
        e1.start();


        System.out.println("main method");
    }
}
