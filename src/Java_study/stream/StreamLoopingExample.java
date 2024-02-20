package Java_study.stream;

import java.util.*;

public class StreamLoopingExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sum = list.stream()
                .mapToInt(n -> n)
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println(n))   // [2, 4] - peek이 없어도 돌아감 6 (중간가공역할)
                .sum();  // sum을 사용하지 않으면 peek은 동작하지 않음

        System.out.println(sum);    // 6
    }
}
