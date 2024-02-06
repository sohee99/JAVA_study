package Java_study.예외처리;

public class 예외예시 {

    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[4]);
        } catch (Exception e) {
            //오류가 났을 경우 처리
            System.out.println("Exception 처리!");
        }
    }
}
