package Threadss;

 class Soni
{
    int total_seat=10;
    synchronized void bookSeat(int seat)
    {
        if(total_seat>=seat)
        {
            System.out.println("seats booked successfully");
            total_seat=total_seat-seat;
            System.out.println("seats left"+total_seat);
        }
        else {
            System.out.println("seats can not booked");
            System.out.println("seats left: "+total_seat);

        }

    }
}
public class Synchronisation1 extends Thread{
static Soni s; //make it gloable so we can access it everywhere
int seat;

     public void run()
     {
        // Soni s=new Soni();
         s.bookSeat( seat);

     }

    public static void main(String[] args) {

         s=new Soni();


        Synchronisation1 sh=new Synchronisation1();
       sh.seat=7;
        sh.start();


        Synchronisation1 sh1=new Synchronisation1();
        sh1.seat=8;
        sh1.start();




    }
}
