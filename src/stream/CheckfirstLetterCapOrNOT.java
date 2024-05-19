package stream;

import java.util.Arrays;
import java.util.List;

public class CheckfirstLetterCapOrNOT {
    public static void main(String[] args) {

        List<String>list= Arrays.asList("Soni","Red","Blue","Suji");

           //check the first letter is in uppercase or not
        boolean list1 = list.stream().anyMatch(s -> Character.isUpperCase(s.charAt(0)));
        System.out.println(list1);



    }

}
