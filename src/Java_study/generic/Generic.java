package Java_study.generic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("3");
        list.add(3);

       // String str = list.get(1);  값을 넣으면 오류 발생 String

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        //캐스팅 없이 출력은 됨

    }
    }
