package Threadss;

public class ExtendThreadclass1 extends Thread{
    public void run()
    {
        System.out.println("no argument method");

    }

    public void run(int a)

    {
        System.out.println("argument method");
    }
    public static void main(String[] args) {
        ExtendThreadclass1 e1=new ExtendThreadclass1();
        e1.start();//it always execute thread class run() method
       e1.run(10);//first execute main tread//if i comments this then no argument method will execute//if i wont comment then
                                               //main threads that is argument method will execute
                                               //always start execution from main method
    }
}
