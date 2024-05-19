package Threadss;

public class GetttingAndSettingThreadName1 extends Thread {
    public void run()
    {
//        System.out.println(Thread.currentThread().getName());//2//Thread-0
//        System.out.println(Thread.currentThread().getName());//2//soni
        
    }

    public static void main(String[] args) {

        GetttingAndSettingThreadName1 g=new GetttingAndSettingThreadName1();
        g.start();
        System.out.println(g.getName());//this will give that thread name which we create 1//Thread-0
        g.setName("soniii");
        System.out.println(g.getName());//3//soni
        System.out.println(Thread.currentThread().getName());//main
        System.out.println(Thread.currentThread().getName());//this will givw current thred name that is main
        Thread.currentThread().setName("moni");
        System.out.println(Thread.currentThread().getName());

    }
}
