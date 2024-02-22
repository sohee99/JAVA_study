package sohee.stream;

import Java_study.try_with_resource.File;

import java.util.stream.Stream;

public class Map {
    /*
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"), new File("Ex1")};
        Stream<File> fileStream = Stream.of(fileArr);
        fileStream.map(File::getName) //File -> String
                .filter(s -> s.indexOf('.') != -1) // 확장자 없는 것은 제외
                .map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출
                .map(String::toUpperCase) // 모두 대문자로 변환
                .distinct()  // 중복제거
                .forEach(System.out::println);
    }
     */
}
