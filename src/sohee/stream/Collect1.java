package sohee.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Collect1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5);

        List<Integer> newlist = list.stream().filter(n->n%2 ==0)
                .toList();

        newlist.forEach(System.out::println);

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        List<Integer> collect = intStream.boxed().toList();
        //기본형 불가능 / boxed()를 추가하여 사용
    }
}
