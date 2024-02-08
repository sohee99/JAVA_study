package Java_study.예외처리;

import java.io.IOException;

public class Executor {
    public static void main(String[] args) //throws XXXException
     {
        try {
            exceptionTest();
            exceptionTest2(); //호출한 여기서 처리를 안해주면 컴파일오류 /던지거나 받거나 해야함
        }catch (Exception e){
            //Logging
        }
    }

    public static void  test2() throws  Exception{
        test3(); //여기서 try-catch 처리가 되지않고 계속적으로 throws 하게 되면?
        try {
            throw  new IOException();
        }catch (IOException e){
            System.out.println("");
            throw  new Exception(); //캐치를하고 다시 throw를 하면?
        }

    }

    public static void test3(){
        try{
            exceptionTest();
            exceptionTest2();
        }catch (XXXException e){

        }

    }

    public static void  exceptionTest(){
        //던지거나(throws), 본인이 처리하거나 ( try-catch )
        throw new RunXXXException("런타임 예외 던지기"); //뒤에있는 로직 실행도 못하고 종료
    }

    public  static void exceptionTest2() throws  XXXException{
        throw new XXXException("Checked 예외 던지기");
    }

}
