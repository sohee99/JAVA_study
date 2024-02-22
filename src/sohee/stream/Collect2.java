package sohee.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,5);

       Set<Integer> collect = list.stream().filter(n->n%2 ==0).collect(Collectors.toSet());
        collect.forEach(System.out::println);
    }
}
