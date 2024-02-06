package Java_study.예외처리;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSample {
/*
    public static void main(String[] args) throws FileNotFoundException {
        Sample sample = new Sample();
        try {
            sample.test();
            }catch (FileNotFoundException e){
            System.out.println("FileNotFoundException 발생 여기서 에외 처리해줌 ");
        }
    }
 */
        public static void main(String[] args) throws java.io.IOException {
            BufferedReader br = new BufferedReader(new FileReader("잘못된 경로"));
            br.readLine();
            br.close();
        } //존재하지 않는 파일로 접근 했을 때 예외 발생


    private static class IOException extends Exception {
    }
}
