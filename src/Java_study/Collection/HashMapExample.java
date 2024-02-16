package Java_study.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. Map 컬렉션 생성
        Map<String,Integer> map = new HashMap<>();

        map.put("윈터", 80);
        map.put("카리나",85);
        map.put("제시카",95);
        map.put("윈터",85);
        System.out.println("총 Entry 수: " + map.size());    // 저장된 총 Entry 수 얻기

        // 2. 객체 찾기
        System.out.println("\t윈터 : " +map.get("윈터"));
        System.out.println();

        // 4. 객체 삭제
        map.remove("윈터");
        System.out.println("총 객체 수 : " + map.size());

        // 5. 객체를 하나씩 처리
            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ": " + value);
            }
            System.out.println();

        // 6. 모든 Map.Entry 삭제
            map.clear();
            System.out.println("총 Entry 수 : " + map.size());

    }
}
