package lambdaexpression;

interface InterfaceA{

    static void show(){
        System.out.println("interface A method");
    }
}

interface InterfaceB{
    static void show(){
        System.out.println("interface b method");
    }
}
public class StaticMethodDiamondProblem implements InterfaceA,InterfaceB
{

    public static void main(String[] args) {
        InterfaceA.show();
    }
}
