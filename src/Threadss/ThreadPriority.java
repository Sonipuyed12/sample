package Threadss;

public class ThreadPriority extends Thread{
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());//this is main thread priority that is 5 which is by default present

        //if we want to update the priority of main thread
        Thread.currentThread().setPriority(7);//here we chnage the priority
        System.out.println(Thread.currentThread().getPriority());//7


        //if i pass argument more than 10 then i get illegalargumrntexception
        Thread.currentThread().setPriority(15);//IllegalArgumentException
        System.out.println(ThreadPriority.currentThread().getPriority());//main thread

        //now create the object of child
        ThreadPriority t=new ThreadPriority();
      //  all the remaining threads the default priority will be inheriting from parent to child
     //here child threads parent is main thread
        System.out.println(t.getPriority());//child thread //here we get 7 becuse we chnge the main thraed priority
                                            //by default main thread priority is 5 if we chnage the priority and done 7 then child threads also give that priority
                                            //because main thread is parent of child thread
                                          //it fallows the the default priority only main thread is 5 but all the remaining threads the default priority will be inheriting from parent to child




    }
}
