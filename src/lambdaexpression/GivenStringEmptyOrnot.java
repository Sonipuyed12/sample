package lambdaexpression;
import java.util.function.Predicate;

public class GivenStringEmptyOrnot {
    public static void main(String[] args) {

        String s="";
        String s1="soni";


        Predicate<String> isEmptyString1=str -> str.isEmpty();


        System.out.println(isEmptyString1.test(s));
        System.out.println(isEmptyString1.test(s1));

    }
}
