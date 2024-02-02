package Java_study.Clas_Study;

public class Calculator {
    double result;

    double add(double x, double y){
        return x + y;
    }

    double divide(double x, double y){
        return  x / y;
    }

    int multiply(int x, int y){
        //double로 리턴타입을 지정하면 실수형 값인 20.0이 나온다.
        return  x * y;
    }

    int minus(int x, int y){
        return x - y;
    }

    int postfixOperator(int a){ //call by value
        a++;
        return a;
    }

    public static void main(String[] args) {

       Calculator calculator = new Calculator();

       calculator.result = calculator.add(1,5);
        System.out.println(calculator.result);

        // 객체 생성
        double result = calculator.add(1.45, 6.78);

        System.out.println(result);
        //리턴 타입이 있더라도 호출만해줘도 상관없음! calculator.divide 호출 *변수로 받아주지 않아도 됨!
        double divResult = calculator.divide(4.56,3.4);
        System.out.println(divResult);

        System.out.println(calculator.multiply(4,5));

        System.out.println(calculator.minus(6,3));

   /* int a = 1;
     Calculator calculator = new Calculator();
    int result = calculator.postfixOperator(a);
        System.out.println(result);       // a = 2로 출력되도록 메소드 수정하기
    */
    }
}
