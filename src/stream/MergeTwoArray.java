package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
    public static void main(String[] args) {

        int [] a={1,4,8,9,3};
        int [] b={4,5,0,1,2};

        //convert to array into stream by using IntStream.concate method and then that stream return as aInteger Array by using toarray method
          //here map return the square of each element

        int [] c= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().map(s->s*s).toArray();
        System.out.println(Arrays.toString(c));




    }
}
