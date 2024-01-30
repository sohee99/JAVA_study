public class Java_study1{

 //증감 연산자

        public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("----------------------");
        x++; //11
        ++x; //12
        System.out.println("x=" + x); //12

        System.out.println("----------------------");
        y--; //9
        --y; //8
        System.out.println("y=" + y); //8

        System.out.println("----------------------");
        z = x++; //12
        System.out.println("z=" + z); //12
        System.out.println("x=" + x); //13

        System.out.println("----------------------");
        z = ++x; //14
        System.out.println("z=" + z); //14
        System.out.println("x=" + x); //14

        System.out.println("----------------------");
        z = ++x + y++; //23
        System.out.println("z=" + z); //23
        System.out.println("x=" + x); //15
        System.out.println("y=" + y); //9
   }


논리 부정 연산자(!)

        public static void main(String[] args) {
        boolean play = true;
        System.out.println(play); //true

        play = !play;
        System.out.println(play); //false

        play = !play;
        System.out.println(play); //true
    }


비트연산자

        public static void main(String[] args) {
        int a = 5; // (부호+)0101
        System.out.println(~a); //(부호-)1010 -(a+1)
    }


이항 연산자 특징 : 표현범위가 큰 타입 변환 / 정수 + 실수의 경우 실수가 이김!!

        public static void main(String[] args) {
        float a = 45f;
        int b =123;
        float sum = a+b;
        System.out.println(sum);

    }

 반올림, 버림 예시

    public static void main(String[] args) {
        float a = 45f;
        double b = 54.56;
        double sum = a+b; //99.56

        double result = Math.round(sum); //Math.round - 반올림 floor - 버림
        System.out.println(result);
    }

 사칙 연산 %

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b );
        System.out.println( a % b );
    }

 오버플로우

    public static void main(String[] args) {
        int a = 1000000;
        int b = 1000000;
        System.out.println((long)a * b);
    }

 NaN, Infinity

    public static void main(String[] args) {
        double a = 10;
        double b = 0;

        double div = a / b; //int 로 했을 시, 쓰레기값 발생
        double c = a % b;

        System.out.println(div); //Infinity
        System.out.println(c);   //NaN
    }

 비트 연산자 : & | ^

    public static void main(String[] args) {
       i는 2의 배수 또는 3의 배수
           int i =13;
           boolean result = (i % 2 == 0 ) || ( i % 3 == 0)

        i는 78보다 작거나 45보다 크다
            int i = 13;
            boolean result = ( i < 78 ) & ( i > 45)
    }

 삼항 연산자

    public static void main(String[] args) {
        int score = 95;
        char grade = (score > 90) ? 'A' : 'B';
        System.out.println("당신의 학점은 : " + grade);
        //if 조건절
        if(score > 90){
            grade = "A";
        }else {
            grade ="B";
        }
        System.out.println("당신의 학점은 : " + grade);
    }

 삼항연산자 퀴즈 80점 이상일 때 A 70이상~ 80점 미만 일 때, B 70점 미만 C

    public static void main(String[] args) {
        int score = 60;
        char result = (score >= 80) ? 'A' : ((score >= 70) ? 'B' : 'c');
        System.out.println("당신의 학점은 : " + grade);
    }

 if문

    public static void main(String[] args) {
        int score = 93;

        if (score >= 90) {
            System.out.println("등급은 A입니다");
        } else if (score >= 80 && score < 90) {
            System.out.println("등급은 B입니다");
        } else if (score >= 70 && score < 80) {
            System.out.println("등급은 C입니다");
        } else {
            System.out.println("등급은 D입니다");
        }
    }

 switch/case 문

    public static void main(String[] args) {
        int month = 3;
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";   // 유효하지 않은 범위의 값을 입력받았을 때 예외처리
                break;
        }
        System.out.println(monthString);
    }

 배열

    public static void main(String[] args) {
        System.out.println(args.length); //길이 즉 args 에 몇개가 들어있는지 !

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
    }

    public static void main(String[] args) {
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"}; //배열형태에서 add 복잡 - 복제해야함
        // 값을 바로 할당하는 초기화 방법
        System.out.println(weeks[2]); //수 -인덱스를 이용하여 값으로 접근

        String[] weeks2 = new String[3]; // 선언과 동시에 사이즈 결정, 초기값 없이 배열변수를 만들 시 길이 지정
        weeks2[0] = "월요일";
        weeks2[1] = "화요일";
        weeks2[2] = "수요일";
    }


    public static void main(String[] args) {
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(weeks.length);

     //   System.out.println(weeks[7]); //배열의 전체 범위를 벗어났을 때, ArrayIndexOutOfBoundsException 발생

        for(int i = 0; i < weeks.length; i++){
            System.out.print(weeks[i]); // print println 띄워짐차이
        }
    }

 문자 > 숫자 형변환
    public static void main(String[] args) {
        String abc = "7654"; //숫자가 온다는 과정하에 변환을 할 수 있다.

        int intValue = Integer.parseInt(abc);
        long longValue = long.parseLong(abc);

        Integer integerValue = Integer.valueOf(abc);

    }
    숫자 > 문자 형변환

    int intValue = 10;
    String StrValue;

    StrValue = String.valueOf(intValue);
    StrValue = Integer.toString(intValue);
    StrValue = "" + intValue; // 정수값에 빈 문자열을 더해 문자열 합치기 연산으로 작동되게 한다
}

 */
}
