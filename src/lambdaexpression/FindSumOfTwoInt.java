package lambdaexpression;
interface Sum
{
    int sum(int a,int b);
}

public class FindSumOfTwoInt {
    public static void main(String[] args) {


        //sum of integer

        Sum s=(a,b)->{return (a+b);
        };

        int s1 = s.sum(10, 20);
        System.out.println(s1);




        Sum sb=(a,b)->{ return (a-b);

        };
        int sb1 = sb.sum(10, 20);
        System.out.println(sb1);

    }
}
