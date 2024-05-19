package lambdaexpression;

interface Soni1
{
    void show();
}
public class Lambdafunction1 {
    public static void main(String[] args) {


        //use lambda function

        Soni1 s = () -> {
            System.out.println("hello soni");


        };
        s.show();
    }
}

