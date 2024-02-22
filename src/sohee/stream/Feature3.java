package sohee.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Feature3 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(1,46);
        intStream.distinct().limit(6).sorted()
                .forEach(i -> System.out.println(i+","));
    }
}
