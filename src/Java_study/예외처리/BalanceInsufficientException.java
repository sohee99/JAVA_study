package Java_study.예외처리;

public class BalanceInsufficientException extends Exception{

    public BalanceInsufficientException() {
    }

    public BalanceInsufficientException(String message) { //입력받은 메시지
        super(message);
    }
}

