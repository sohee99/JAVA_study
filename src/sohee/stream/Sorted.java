package sohee.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,4,2,8,11);
        list.stream().sorted().forEach(System.out::println);
        //Comparator.reverseOrder() 내림차순
    }
}
