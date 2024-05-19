package Threadss;

public class ExtendThreadclass4 extends Thread {

    public void start()
    {
        super.start();
        System.out.println("start method");
    }
    public void run()
    {
        System.out.println("run method");
    }

    public static void main(String[] args) {
        ExtendThreadclass4 e1=new ExtendThreadclass4();
        e1.start();
        System.out.println("main method");
    }

}
