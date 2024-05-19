package basicprogram;

public class CountStringChar {
    public static void main(String[] args) {

        String str="soniiipuyyeddd";

        int [] a=new int[256];

        for (int i=0;i<str.length();i++)
        {
            a[str.charAt(i)]++;//we store char int array andincrease the count
        }

        for (int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                System.out.println((char) i+" "+a[i]);
            }

        }




    }
}
