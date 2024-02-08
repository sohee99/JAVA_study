package Java_study.try_with_resource;

public class File implements  AutoCloseable{

    private  String file;

    public  File(String file){
        this.file = file;
    }

    public void  read(){
        System.out.println(file + "파일을 읽습니다");
    }
    public void close() throws Exception{
        System.out.println("재정의 호출되나?");
    }
}
