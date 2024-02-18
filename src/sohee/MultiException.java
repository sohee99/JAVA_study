package sohee;

public class MultiException {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 30 / 0;
        } catch (ArithmeticException e) {

        } catch (RuntimeException e) {

        }
    }
}
