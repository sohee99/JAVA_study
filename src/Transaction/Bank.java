package Transaction;


import Java_study.예외처리.BalanceInsufficientException;
/*
public class Bank {
    public static void main(String[] args) {
        Account sender = new Account(); //송금인 계좌
        Account receiver = new Account();

        long beforeBalance = sender.getBalance();
        try {
            sender.deposit(2000);//수금인 계좌
            throw new XXXException("에러 수동 발생");
            receiver.deposit(70000);//송금인 계좌.withdraw()
        }catch (XXXException e){
            //에러발생! 모두 취소
            sender.deposit(beforeBalance);
        }catch (BalanceInsufficientException e){
            System.out.println("출금하려는 잔액 부족. 프로그램 종료.");

        }
    }
}*/
