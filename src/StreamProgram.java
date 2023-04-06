package src;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

public class StreamProgram {


    public static void main(String[] args) {
//      Finding Nth Largest Value from Arrays with skip method;
        int [] arg = {1,5,2,4,3,6,8,9};
        System.out.println(Arrays.toString(arg));
        int sum = Arrays.stream(arg).sum();
        System.out.println(sum);


        int sec = Arrays.stream(arg).boxed().sorted(Comparator.reverseOrder()).skip(1)
                .findFirst().get();
        System.out.println(sec);


    }
}
