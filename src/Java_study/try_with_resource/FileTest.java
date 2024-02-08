package Java_study.try_with_resource;

public class FileTest {

    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir");
        try( File inputStream = new File(filePath)) {
            inputStream.read(); //파일을 읽습니다
            System.out.println("test");
            throw  new Exception(); //호출됨 //Autocloseable.close() 재정의
        }catch (Exception e){
            System.out.println("Exception 처리");
        }
    }
}
