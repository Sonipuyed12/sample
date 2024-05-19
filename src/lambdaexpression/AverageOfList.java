package lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class AverageOfList {
    public static void main(String[] args) {
      //  Write a Java program to implement a lambda expression to find the average of a list of doubles.

double sum=0;
double count=0;

        List<Double>list= Arrays.asList(3.3,55.5,89.6,5.5,96.8);

        //normal calculate the average
        for (Double d:list)
        {
            sum=sum+d;
            count++;
        }
        System.out.println(sum/count);


//using lambda function calculate the average

      //  list.












    }
}
