package exception;

public class Throw4 extends RuntimeException{
    public static void main(String[] args) {

        //class throw throw exception
        //if we delare the exceprtion on class level then we get compile time errror if we dont extend that class on runtime exception or throable
        //if we want to delare the exceprtion on class level then that class should be extends by throwable class or runtimeexception
       // throw new ArithmeticException("throws  by new zero ");
        throw new Throw4();

    }

}
