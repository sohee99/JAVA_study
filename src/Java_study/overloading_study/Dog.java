package Java_study.overloading_study;

public class Dog extends Animal{

    void sleep() {
        System.out.println(this.name + " Zzz...");
    }

    void sleep(int hour){
        System.out.println(this.name + " Zzz...");
    }

    void sleep(int a, double hour){
        System.out.println(this.name + " Zzz...");
    }

}
