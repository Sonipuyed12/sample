 interface Soni
{
    //define adbstract method
int add(int a,int b);
}

public class Lambda1 {


    public static void main(String[] args) {
        //use lambda function and provide implementation  of add method
       Soni s=(int a,int b)->
       {
           return a+b;
       };
       int a=s.add(5,8);
       System.out.println(a);



    }
}
