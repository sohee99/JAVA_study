package sohee.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(
                new String[]{"a","b","c"},
                new String[]{"A","B","C"}
        );

     // Stream<Stream<String>> stringStream = strArrStream.map(Arrays::stream);
        Stream<String> stringStream = strArrStream.flatMap(Arrays::stream);
        stringStream.forEach(System.out::println);
    }
}
