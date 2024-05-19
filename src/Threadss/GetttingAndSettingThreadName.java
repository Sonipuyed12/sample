package Threadss;

public class GetttingAndSettingThreadName extends Thread{

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());//give current thread name that is main
        Thread.currentThread().setName("soni");//here we can channage  name of current thread that is main
        System.out.println(Thread.currentThread().getName());
        GetttingAndSettingThreadName g=new GetttingAndSettingThreadName();
        Thread t=new Thread();
        t.start();
       System.out.println(g.getName());//the thread we create it will name of that thread
        t.setName("puyed");
        System.out.println(t.getName());
      // System.out.println(10/0);
    }
}
