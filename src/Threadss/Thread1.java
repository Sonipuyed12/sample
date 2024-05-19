package Threadss;


public class Thread1 extends Thread{

    public void run()
    {
        System.out.println("child method");
    }

    public static void main(String[] args) {
        Thread1 t=new Thread1();
        t.start();
        t.run();

        System.out.println("main method");


    }

}
