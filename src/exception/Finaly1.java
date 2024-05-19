package exception;



public class Finaly1 {
    public static void main(String[] args) {

      //  on which condition finally block will not execute;
        // System.exit(0); if wewrite this in try or catch block

        //when exception occured in finally block

        //we can write try catch block in finally block
        //and we can also the exception


//        int a=10;
//        int b=0;
//
//        try
//        {
//            System.out.println(a/b);
//           // System.exit(0);
//        }
//        catch (Exception e)
//        {
//            System.out.println("catch block");
//            System.exit(0);
//        }
//
//        finally {
//            System.out.println("finally blockk execute");
//        }
//
//        System.out.println("normal statatement");







        //when exception occured in finally block



        int a1=10;
        int b1=0;

        try
        {
            System.out.println("hello");
            // System.exit(0);
        }
        catch (Exception e)
        {
            System.out.println("catch block");
           // System.exit(0);
        }

        finally {//
            //we can write try catch block in finally block(to handle exception)
            //and also the exception

            // if exception is not handle then finally will not execute

            //if exception occured in after finally block then ntg will print except finally will print

            try
            {
                System.out.println("try block");
               // System.out.println(a1/b1);
            }
            catch (Exception e)
            {
                System.out.println("catch block 2");
            }

            //System.out.println(a1/b1);//  //when exception occured in finally block will not execute
                                             //so we can handle it by using try catch block
            System.out.println("finally blockk execute");
        }

       // System.out.println("normal statatement");

        System.out.println(a1/b1);////if exception occured in after finally block then ntg will print except finally will print













    }
}
