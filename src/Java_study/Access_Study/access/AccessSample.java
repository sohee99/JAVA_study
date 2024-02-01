package Java_study.Access_Study.access;

public class AccessSample {
    private int number = 1;
    //클래스 내에서만 접근 가능
    int number2 = 2;
    //같은패키지
    protected int number3 = 3;
    //같은 패키지 or 상속을 받은 부모클래스에서 선언했을 경우 자식 클래스가 패키지가 다르더라도 사용가능
    public int number4 = 4;

    void  printNumber(){
        //클래스내부에서는 private 포함 다 가능
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
    }
}
