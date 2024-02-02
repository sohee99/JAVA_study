package Java_study.Clas_Study;

public class Car {
    String company;

    int speed;

    String sw = "samsung";

    boolean stop;

    Car(){
        company = "kia";
        speed = 200;

    }

    Car(String company, int speed){
        this.company = company;
        this.speed = speed;
    }

    boolean isStop(){
        return stop;
    }

    public void setSpeed(int speed){
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    void changeSoftware(){
        sw = "kakao";
    }



    void  setModel(){
    }
    void  printSpec(){
        System.out.println("company : " + company + ", speed : " + speed + ", sw : " + sw);
    }
}
