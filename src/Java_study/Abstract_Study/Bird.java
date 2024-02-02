package Java_study.Abstract_Study;

public class Bird extends Animal{
    Bird(){
        kind = "조류";
    }
    @Override
    public void sound() {
        System.out.println("짹짹");
    }
}
