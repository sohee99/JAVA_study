package sohee.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Feature5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동","오르미","자바");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println); //stream의 forEach메서드 안에 for문을 넣었기에 가능하다.
    }
}
