package Threadss;


public class ExtendThreadclass  extends Thread{

   public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("child thread");
        }
    }

    public static void main(String[] args) {
        ExtendThreadclass i=new ExtendThreadclass();
        //i.start();//create new thread execution path  and execution first main method then thread class run method
       i.run();//execution happen line by line
        System.out.println("main method1");
        for(int i1=0;i1<5;i1++)
        {
            System.out.println("parent thread");
        }
        System.out.println("main method");


    }
}
