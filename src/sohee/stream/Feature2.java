package sohee.stream;

import java.util.stream.Stream;

public class Feature2 {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("a","b","c");
        strStream.forEach(System.out::println);

        strStream = Stream.of("a","b","c");
        long count = strStream.count();
        System.out.println("count = " + count);
    }
}
