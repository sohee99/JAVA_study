package Java_study.stream;

import java.util.*;

public class FlatmapExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello World", "Java stream", "HiStream");

        // [Hello, World, Java, stream]
        list.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .forEach(System.out::println);
    }
}
