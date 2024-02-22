package sohee.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Generator2 {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("a","b","c");
        Stream<String> strStream2 = Stream.of(new String[]{"a","b","c"});
        Stream<String> strStream3 = Arrays.stream(new String[]{"a","b","c"});

        IntStream intArr1 = IntStream.of(1,2,3,4);
        int[] intArr = {1,2,3,4};
        IntStream intArr2 = IntStream.of(intArr);
        IntStream intArr3 = Arrays.stream(intArr);

        Integer[] integerArr = {1,2,3,4};
        //IntStream intStream1 = IntStream.of(integerArr); 에러
        Stream<Integer> intStream1 = Stream.of(integerArr);
    }
}
