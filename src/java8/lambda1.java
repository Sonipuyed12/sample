package java8;

@FunctionalInterface    //this annotation is not mandatory either you provide or not compiler will automatically it bydefault
interface SAMInterface

{
    //the interface which is having only one abstract method is call functionalinterface
    void test(int a);
}

public class lambda1 {
    public static void main(String[] args) {

        SAMInterface s=(int a) ->
        {
            //you cana write here multiple sentences
            System.out.println(a);
        };
        s.test(9);
    }
}
