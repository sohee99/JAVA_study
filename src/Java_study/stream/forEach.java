package Java_study.stream;

import java.util.*;

public class forEach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream()
                .mapToInt(n -> n)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);   // [2, 4]
    }
}