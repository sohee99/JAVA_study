package sohee.stream;

import java.util.stream.IntStream;

public class distinct {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,2,2,3,4,5,5,6,6);
        intStream.distinct().forEach(System.out::println);
    }
}
