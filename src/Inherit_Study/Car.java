package Inherit_Study;

public class Car extends Vehicle{

    Car(String model, int speed, boolean stop){
        super(model, speed);
    }

    public void print(){
        System.out.println("Child : " +modal + ", " + speed + "," + stop);
    }
}
