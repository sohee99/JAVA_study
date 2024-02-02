package Java_study.Inherit_Study;

public class Motorcycle extends Vehicle{ // 다른언어와 달리 자바는 다중 상속이 지원되지 않는다.

    private String rider; //새로운 요소도 추가 가능

    void  setSpeed(int speed){   //새로운 메소드 추가 가능
        this.speed = speed;
    }
    public void print(){
        System.out.println("Child(Motorcycle) : " + modal + ", " + speed + "," + stop);
    }
}
