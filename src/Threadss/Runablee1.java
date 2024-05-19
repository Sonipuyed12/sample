package Threadss;

public class Runablee1 implements Runnable {
    public void run()
    {
        System.out.println("child thread");
    }

    public static void main(String[] args) {
        Runablee1 r=new Runablee1();
        Thread t= new Thread();
        Thread t1=new Thread(r);

        //case 1st
       // t.start();//child thread will start and it call run method thread class which doesnt have any implementation


        //case 2nd
        //it will call run method of thread class which doesnt have any implementation
        //t.run();

        //3rd case
        //new thread will be created and run my runnable class method
      //  t1.start();

        //case 4th
        //no new thread will be created and my current class run method will be execute
        //t1.run();

        //case 5th
        //here we get error because my current runablee class doesnt have any start()  method thats why
       // r.start();//error

        //case 6th
        //no thread will be created and normal my current class run method will be execute
        r.run();


        System.out.println("main thread");

    }
}
