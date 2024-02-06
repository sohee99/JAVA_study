package Java_study.예외처리;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(30000); //입금
        System.out.println("예금액: " + account.getBalance());

        try {
            account.withdraw(100000); //10만원 출금하기
        } catch (BalanceInsufficientException e) {
            // 예외 발생 경로를 추적
            System.out.println(e.getMessage());
            // e.printStackTrace(); 이것을 통해서 출력을 했기 때문에 에러메시지 발생 - 사용 x
        }
    }
}

