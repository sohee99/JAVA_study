package sohee.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Generator1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream();

        intStream.forEach(System.out::println);

        intStream = list.stream();
        intStream.forEach(System.out::println);
    }
}
