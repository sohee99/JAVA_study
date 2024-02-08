package Java_study.try_with_resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        String filepath = "C:/Users/통마/Java-project/src/test.txt";
        try( BufferedReader br = new BufferedReader(new FileReader((filepath)))) {
            //close 메소드를 가지고 있는 클래스여야 실행이 됨
            System.out.println(br.readLine());
          //  br.close(); //알아서 실행이 되는것 예외가 이루어져있던 자동으로 처리
            //자동리소스 실행
        }catch (IOException e){
            System.out.println("예외처리 로직");
        }

        BufferedReader br = null;

//    try {
//        br = new BufferedReader(new FileReader(filePath));
//        System.out.println(br.readLine());
//    } catch (IOException e) {
//        // 예외처리 로직
//    } finally {
//        if (br != null) {
//            try {
//                br.close();
//            } catch (IOException e) {
//                // 예외처리
//            }
//        }
//    }
  }
}


