package Threadss;

public class ThreadPriority2 extends Thread{

    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("child thread");
        }
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());
        ThreadPriority2 t=new ThreadPriority2();
        t.start();//internally call run method
        t.setPriority(7);//if i comments this then i wll get both main thread priority and child thread priority same
                        //hence we cant expect exact execution order its depend on then thread schedular
        System.out.println(t.getPriority());

        for(int i=0;i<10;i++)
        {
            System.out.println("parent thread");
        }
    }
}
