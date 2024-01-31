package Clas_Study;

public class Car {
    String company;

    int speed;

    String sw = "samsung";


    Car(){
        company = "kia";
        speed = 200;

    }

    Car(String company, int speed){
        this.company = company;
        this.speed = speed;
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
