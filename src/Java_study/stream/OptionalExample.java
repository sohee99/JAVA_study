package Java_study.stream;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // 비어있는 Optional 객체 반환
        Optional<String> empty = Optional.empty();

        // null이 아닌 값을 갖는 Optional 객체 반환
        Optional<String> of = Optional.of("Optional 객체");

        // null을 허용하는 Optional 객체 반환
        Optional<String> nullableOpt = Optional.ofNullable("Nullable Optional 객체");

        String ofStr = nullableOpt.get(); // get을 사용하여 꺼낼수도 있음
        String returnStr = nullableOpt.orElse("default value");
    }

}
