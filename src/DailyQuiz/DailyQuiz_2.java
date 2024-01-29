package DailyQuiz;

public class DailyQuiz_2 {
 
 1. 아래 2개의 변수 number1, number2의 사칙 연산 결과(result1 ~ result4)를 정수로 출력하세요.
      (사칙연산: +, -, *, /) 주석처리 된 곳에 코드를 채우면 됩니다.

   public static void main(String args[]) {
        int number1 = 10;
        double number2 = 2.0;

          // 사칙연산 코드 추가
        double result1 = number1 + number2; //12.0
        double result2 = number1 - number2; //8.0
        double result3 = number1 * number2; //20.0
        double result4 = number1 / number2; //5.0


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

2. 아래 코드의 출력값은 무엇일까요? 코드를 돌려보기 전에 예측해보세요.
 
2-1.
    public static void main(String args[]) {
        // 아래 코드의 출력값은 무엇일까요? 17
        System.out.println(10 / 2 + 3 * 4);
    }
  }

2-2.
    public static void main(String args[]) {
        // 아래 코드의 출력값은 무엇일까요?
        int number = 10;

        int result1 = number + 1;
        int result2 = number++;
        int result3 = number;
        int result4 = --number;

        System.out.println(result1); //11
        System.out.println(result2); //10
        System.out.println(result3); //11
        System.out.println(result4); //10
    }

2-3.
        public static void main(String args[]) {
        // 아래 코드의 출력값은 무엇일까요?
        int num1 = 5;
        int num2 = 7;

        System.out.println((num1 > 5) && (num2 > 5)); //false
        System.out.println((num1 > 5) || (num2 > 5)); //true
        System.out.println(!((num1 > 5) && (num2 > 5))); //true
    }

3. 다음의 내용을 연산식(조건식)으로 표현해보세요.
    - i는 2의 배수 또는 3의 배수이다.

    public static void main(String[] args) {
        int i = 15;

        System.out.println(( i % 2 == 0 ) || ( i % 3 == 0 ));
    }

4. 아래 코드의 실행 결과가 true가 되도록 수정해보세요.
        public static void main(String args[]) {
        // 아래 코드의 실행 결과가 true가 되도록 수정해보세요.
        String str1 = new String("Hello world!");
        String str2 = new String("Hello world!");

        System.out.println(str1.equals(str2));
    }

}

