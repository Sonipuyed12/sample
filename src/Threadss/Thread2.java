package Threadss;

public class Thread2 extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("printing this message");
        }
    }

    public static void main(String[] args) {
        Thread2 t = new Thread2();
        Thread2 t1=new Thread2();
       // System.out.println(Thread.currentThread().getName());///this will give current thread name that is main
        System.out.println(t.getName());//this will give we created thread name
        System.out.println(t1.getName());
        t1.setName("TestThread00");
        System.out.println("Thread name"+" " + t1.getName());
        t.setName("TestThread");//here you create thread///and call that thread
        System.out.println("Thread name" + " " + t.getName());
         t.start();//it execute only run methods implementattions
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("printing this message1");
        }

        //by creating new stack
     //  t.run();//if i go through this only normal excution will happen by line by line
//t.run();
        System.out.println("hello");

    }

}