package exception;

public class Throw2 {

    //we create the obj of exception and then throw its ref using throw keyword
  static  ArithmeticException a;
          //=new ArithmeticException();//if we make obj ref as null then it gives null pointer excpetion

    public static void main(String[] args) {

      //  ArithmeticException a=new ArithmeticException();
        throw a;



    }
}
