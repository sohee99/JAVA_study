package Java_study.Interface_Study;

public interface InterfaceSample {
    //필드에는 Static 밖에 못옴
    void print();

    default void  defaultMethodTest(){

    }
}
