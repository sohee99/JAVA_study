package Java_study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class map {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        Stream<String> streamStream = list.stream().map(String::toUpperCase);
        streamStream.forEach(System.out::println);



    }

}
