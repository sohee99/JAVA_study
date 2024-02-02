package Java_study.Abstract_Study;

import Java_study.overloading_study.Calculator;

public class Cat extends Animal{
    Cat(){
        kind = "포유류";
    }
    @Override
    public void  sound(){
        System.out.println("야옹");
    }
}
