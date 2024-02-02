package Java_study.Inherit_Study;

public class Vehicle {
    String modal; //부모클래스라도 dafault 라서 다른 패키지에서는 접근 불가 이때는 protected 사용

    int speed;

    boolean stop;

    String color;

    int wheelCount;

    boolean onOff;

    public String getModal(){ //private 라면 getModal 을 사용하여 접근 한다.
        return modal;
    }

    public Vehicle(){
        modal = "Tesla modelX";
        speed = 300;
        stop = true;
    }

    public Vehicle(String modal, int speed){
        this.modal = modal;
        this.speed = speed;
    }
    public void print(){
        System.out.println(modal + ", " + speed + "," + stop);
    }
}
