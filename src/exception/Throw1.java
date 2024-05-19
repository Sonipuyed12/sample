package exception;

public class Throw1 {
    static void fun()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException n)
        {
            System.out.println("NullPointerException handled");
            throw new NullPointerException();
        }


    }

    public static void main(String[] args) {
        Throw1 t=new Throw1();

         try
         {
             fun();
         }
         catch(NullPointerException e)
         {
             System.out.println("exception handled");
         }
    }
}
