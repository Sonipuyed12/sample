package Threadss;

public class Join1 extends Thread {
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("child thread"+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println("child thread completed");
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        //if we want to complete the 1st thread task then execute 2nd then we should use join method
        //if we want to stop execution osf main thread then we should use the ref of child thread
        //that is thread t= new thread((;
        //t.join();//throw this t we can pause it for some tiome and after execution of child thread the main will join it after that
        //if we want child thread stop then create the ref of main thread and stop the child thread adter that main will execute and after that child will execute


        Join1 j=new Join1();
        j.start();
        // Thread.yield();//output is not give same as we want it gives different output
        j.join();//using this execution order will mainttain main will go in waiting after the execution of child then main will join child
                 //here 1st child then main //main will waiting after child it will join then
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("main thread"+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println("mainthread completed");
        }
    }
}
