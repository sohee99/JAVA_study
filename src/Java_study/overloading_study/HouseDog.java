package Java_study.overloading_study;

public class HouseDog extends Animal{

    void sleep(int hour){
        System.out.println(this.name + " Zzz..." + hour);
    } //정수형일때 호출

    int sleep(double hour){ //실수형일때 호출
        return 0;
    }
    //만약리턴타입만 다르다면? 무엇을 호출해야할지 몰라서 오류난다.

    //메소드의 이름 같음
    //매개변수의 개수 또는 타입이 달라야 합니다.
}
