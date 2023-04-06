package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream2 {

//    Finding Second-Largest number in List or ArrayList
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(5,6,8,4,8,4,2,10,3,9,6,9);

        int second = integerList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .get();
        System.out.println(second);

    }
}
