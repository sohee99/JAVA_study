package Java_study.예외처리;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_case {
    public static void main(String[] args) {
        BufferedReader br = null;
        System.out.println("0"); //메인출력시 0출력
        try {
            br = new BufferedReader(new FileReader("존재하지 않는 파일")); // 에러
            br.readLine(); // 제쳐두고 2번으로 들어간다
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException 발생");
            System.out.println("2"); //캐치 후 빠져나간다.
        } catch (IOException e) {
            System.out.println("IOException 발생");
            System.out.println("3");
        }
        System.out.println("4"); //끝을 출력한다.
    }
}
