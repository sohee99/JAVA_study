package Java_study.Collection;

import java.util.*;

public class MapExample2 {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = Arrays.asList(3,3,5,8,2,2);
        /*
        int i = 0;
        while (i < list.size()) {
            Integer number = list.get(i);
            map.put(number, map.getOrDefault(number, 0) + 1);
            i++;
        }
        */
        for(int element : list){
            map.put(element, map.getOrDefault(element,0)+1);
        }
            System.out.println(map);
        }


    }

