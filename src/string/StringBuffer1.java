package string;

public class StringBuffer1 {
    public static void main(String[] args) {

//        StringBuffer sb=new StringBuffer("soni");
//        System.out.println(sb.capacity());
//
//        //append()
//         //new obj will not created  old will update
//        System.out.println(sb.append("puyed"));






         StringBuffer sb1=new StringBuffer("soni puyed");

         System.out.println(sb1.insert(1,"java"));//sjavaoni puyed//insert string fron start index to endindex-1

        System.out.println(sb1.delete(1,3));//delete string from fron start index to endindex-1

        //reverse()
        System.out.println(sb1.reverse());







    }
}
