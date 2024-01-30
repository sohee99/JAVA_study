package Java_study;

public class While_Study {
/*
    public static void main(String[] args) {
        int index = 1;
        while (index <= 5 ){
            System.out.println(index);
            index++;
        }
    }



        public static void main(String[] args) {
            int treeHit = 0;
            while (treeHit < 10) {
                treeHit++;  // treeHit += 1 로도 표현 가능
                System.out.println("나무를  " + treeHit + "번 찍었습니다.");
                if (treeHit == 10) {
                    System.out.println("나무 넘어갑니다.");
                }
            }
        }

while문 빠져나가기 - break

    public static void main(String[] args) {
        int coffee = 10;
        int money = 300;

        while (money > 0) {
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은 " + coffee + "입니다.");
            if (coffee == 0) {
                System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
                break;
            }
        }
    }


    public static void main(String[] args) {
        int coffee = 10;
        int money = 300;

        while (money > 0){
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            money = money - 100;
            System.out.println("남은 커피의 양은" + coffee + "입니다.");
            if(coffee == 0){
                System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
                break;
            }
        }
    }


Q. while 문을 사용해서 1 ~ 10 범위 홀수만 출력해주세요.

    public static void main(String[] args) {
        int number = 0;
        while (number < 10){
            number++;
            if(number % 2 != 0){
                System.out.println(number);
            }
        }
    }

do -while 문

    public static void main(String[] args) {
        // do ~ while 문 사용해서 1~5 출력
        int index = 0;
        do{
            //실행문
            index++;
            System.out.println(index);
        }while (index < 5);
    }

Q.do-while 문 사용해서 10 이하의 짝수를 구하시오.*/
    public static void main(String[] args) {
        int i = 0;
        do{
            i++;
            if(i % 2 == 0){
                System.out.println(i);
            }
        }while (i < 10);
    }

}