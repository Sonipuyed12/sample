package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayWithoutDuplicate {
    public static void main(String[] args) {


        int [] a={1,6,9,40,3,20};
        int[]b={2,4,60,7,58,4};

        int []c= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(c));







    }
}
