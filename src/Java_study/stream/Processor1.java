package Java_study.stream;

import java.util.stream.IntStream;

public class Processor1 {
    public static void main(String[] args) {
      //  IntStream intStream = IntStream.of(1,2,2,2,3,4,5,5,5,6,6,7,8,9,10,10);
      //  intStream.distinct().limit(5).sorted().forEach(System.out::println);

        IntStream intStream = IntStream.of(1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8, 9, 10, 10);
        IntStream distinct = intStream.distinct();
        IntStream limit = distinct.limit(5);
        IntStream sorted = limit.sorted();
        sorted.forEach(System.out::println);
    }
}
