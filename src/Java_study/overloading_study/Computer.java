package Java_study.overloading_study;

public class Computer extends Calculator{
    @Override
    double areaCircle(int r){
        System.out.println("Computer 객체의 areaCircle() 실행");
        return  Math.PI * r * r;
    }
}
