package lambdaexpression;
interface Soni2
{
    default int show(int a)
    {
        System.out.println("helooo parent class");
        return a;
    }
}

interface Vidhi
{
    default int show(int a)
    {
        System.out.println("helooo 2ndparent class");
        return a;
    }
}
public class ApplyOndefaultm {
    public static void main(String[] args) {


    }
}
