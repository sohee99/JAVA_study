package sohee.stream;

import java.util.stream.IntStream;

public class Filter {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,10); //2의 배수
        intStream.filter(i-> i%2 ==0).forEach(n-> System.out.print(n+","));

        System.out.println();

        System.out.println("filter2 예제"); //짝수가 아니고 3의배수가 아닌것
        intStream = IntStream.rangeClosed(1,10);
        intStream.filter(i->i%2!=0 && i%3!=0).forEach(n-> System.out.print(n + ","));

        System.out.println();

        System.out.println("filter3 예제");
        intStream = IntStream.rangeClosed(1,10);
        intStream.filter(i->i%2!=0).filter(i->i%3!=0).forEach(n-> System.out.print(n + ","));

    }
}
