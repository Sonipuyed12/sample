package demo;

public class Exception1 {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try
        {
            System.out.println(a/b);
        }
        catch (NullPointerException e)
        {
            //e.printStackTrace();//if we use this then it will give op before finally
                                 //if we dont use then it will give op after finally block
            System.out.println("catch block");
        }

        finally {
            //System.out.println(a/b);

            System.out.println("finally block");
        }

        System.out.println("hello soni");


    }
}
