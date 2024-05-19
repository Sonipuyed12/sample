package stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(31);
        list.add(98);
        list.add(77);
        list.add(988);


        //find the even number
        //normal program
        for (Integer i:list)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

        //using stream

        List<Integer> newList = list.stream().filter(i -> i %2 == 0).collect(Collectors.toList());
         System.out.println(newList);



         //calculate the number which is greater than 10

        for (Integer i:list)
        {
            if (i>10)
            {
                System.out.println(i);
            }
        }


        //using stream

        Stream<Object> newStream = Stream.empty();
        newStream.forEach(i->{
            System.out.println(i);//here i is variable
        });

        List<Integer> list1 = list.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(list1);








    }
}

