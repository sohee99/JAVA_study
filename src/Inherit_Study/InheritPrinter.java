package Inherit_Study;

public class InheritPrinter {

    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.speed = 0;
        motorcycle.stop = false; //자식클래스에서는 부모값을 물려받았지만 여기서 변경가능
        motorcycle.print();
    }
}
