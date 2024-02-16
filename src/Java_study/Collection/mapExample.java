package Java_study.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class mapExample {

        public static void main(String[] args) {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "레드향");
            map.put(2, "사과");
            map.put(3, "바나나");
            map.put(4, "샤인머스켓");

            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
            }
        }
    }

