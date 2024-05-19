package lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class MUltiplyndSum {
    public static void main(String[] args) {
int i=0;
int num=1;
        List<Integer>list= Arrays.asList(1,2,45,69,80,90,98,65,76);

        //normal for loop
        for (Integer i1:list)
        {
            i+=i1;
            num*=i1;
        }

        System.out.println(i);
        System.out.println(num);


        //using lambda

        int result = list.stream().reduce(1, (a, b) -> a * b).intValue();
        System.out.println(result);

        int sum = list.stream().reduce(0, (a, b) -> a + b).intValue();
        System.out.println(sum);

    }
}
