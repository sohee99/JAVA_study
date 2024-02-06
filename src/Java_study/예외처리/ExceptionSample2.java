package Java_study.예외처리;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionSample2 {
    public static void main(String[] args) {
        int a = 3 / 0;
        System.out.println(a);
    }

    public void  test() throws  FileNotFoundException{
        throw  new FileNotFoundException();
    }
}
