package Java_study.예외처리;

public class DivideExceptionSample {
    void finalMessage() {
        System.out.println("그럼 수고하세요.");
    }
    public static void main(String[] args) {
        DivideExceptionSample sample = new DivideExceptionSample();
        int result;
        try {
            result = 3 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            result = -1;
            System.out.println("숫자는 0으로 나눌 수 없습니다. result=" + result);
        }finally {
            sample.finalMessage();
        }
    }
}
