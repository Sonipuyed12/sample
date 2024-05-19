package Threadss;

public class Join3 extends Thread {

    //using join mehod execution will happen serialy as we want
static Thread m;
    public void run()
    {
        try
        {
            //using main thread ref variable stop the execution of child(that is it go in waiting state) and after the main execution then main join join the child thread
            m.join();
            for(int i=1;i<=5;i++)
            {
                System.out.println("child thread"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }



    }

    public static void main(String[] args) throws InterruptedException
    {
        //just create one main tread ref variable
         m=Thread.currentThread();

        Join3 j=new  Join3();
        j.start();
       // j.join();
        try
        {

            for(int i=1;i<=5;i++)
            {
                System.out.println("main thread"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException i)
        {
            System.out.println(i);
        }

    }

}
