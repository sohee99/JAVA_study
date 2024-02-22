package sohee.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Feature1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 5, 4, 2));
        List<Integer> sortedList = list.stream().sorted().toList();

        System.out.println(list);
        System.out.println("sortedList = " + sortedList);

        //참고 - 컬렉션일 경우
//        list.remove(1);
//        System.out.println("List = " + list);
//        list.add(1000);
//        System.out.println("List = " + list);

    }
}
