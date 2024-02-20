package Java_study.stream;

import java.util.*;
import java.util.stream.Collectors;

public class groupingBy {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);
        List<String> stringList = list.stream()
                .distinct()
                .map(Object::toString)
                .collect(Collectors.toList());
                System.out.println(stringList);


    }
}
