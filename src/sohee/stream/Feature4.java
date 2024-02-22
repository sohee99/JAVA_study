package sohee.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Feature4 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(1,46);
        intStream.distinct().limit(6).peek(System.out::println).sorted();
        //최종연산이 없는 코드는 프린트문이 실행되지 x
    }
}
