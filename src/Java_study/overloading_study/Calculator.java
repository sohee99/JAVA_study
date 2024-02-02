package Java_study.overloading_study;

public class Calculator {
    private  static  final double PI = 3.14159;

    double areaCircle(int r){
        System.out.println("Calculator.areaCircle");
        return  PI * r * r;
    }
}
