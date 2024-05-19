package Threadss;

public class yield1 extends Thread{

    //the main motive is stop excution of current thread and give chance to the same or higher priority thread
    public void run()
    {
        //  Thread.yield();
        for(int i=1;i<=5;i++)
        {
          //  Thread.yield();
            System.out.println(Thread.currentThread().getName()+" "+i);
          //  System.out.println("child thread"+" "+i);
        }
    }

    public static void main(String[] args) {

        yield1 y=new yield1();
        y.start();
           Thread.yield();//it depends on ts which accept or ignore the hint which give to the yield method
        for(int i=1;i<=5;i++)
        {
            System.out.println("main thread"+" "+i);
        }
        System.out.println("hello soni");

    }

}
