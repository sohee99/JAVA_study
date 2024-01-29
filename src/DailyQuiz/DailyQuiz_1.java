public class DailyQuiz_1{

    1. serialNo는 15자리의 숫자로 이루어져 있습니다. serialNo 변수를 선언하는 한 줄의 코드를 적으세요. 
        public static void main(String[] args) {

        long serialNo = 123456789123456L;
        System.out.println(serialNo);
       }


     2. 다음 문장들의 출력 결과를 확인해보세요.
            
        System.out.println("10" + "04");
       //1004
       System.out.println("" + false);
        //false
        System.out.println('a' + 100);
        //197

     3.
    public static void main(String args[]) {
        // 에러가 발생하는 부분을 고쳐보세요.
       byte a = 999; > int a = 999;
        char b = 'abc'; > String b = "abc";
        float c = 1.23d; >  float c = 1.23f;    
    }

     4. 다음 중 기본 자료형(primitive type)이 아닌 것은? 2

         1. int
         2. String
         3. boolean
         4. short

     5. char 타입에 저장할 수 있는 정수 값의 범위는?  0~65535

     6.  다음 중 변수를 잘못 초기화한 것을 모두 고르세요. 2.3.4

              1. int a = 1;
              2. char b = ‘’;
              3. char c = ‘Hello’;
              4. byte d = 12345;

      7. 다음 수식의 결과 값과 타입은?

           1. 100 + 10.5 = 110.5 double 타입
           2. 100 / 5 = 20 int 타입
           3. 10.0 / 5 = 2.0 double 타입

      8.‘가’라는 한글 문자의 유니코드를 찾아서 char 타입의 변수로 만들어봅시다.
                  
                    char a = '\uAC00';
                    System.out.println(a);

      9. 아래 코드는 변수 x, y, z의 값을 서로 바꾸는 예제입니다. 실행 결과처럼 출력되도록 빈칸에 알맞은 코드를 넣어주세요.   

            public static void main(String[] args) {

            int x = 1;
            int y = 20;
            int z = 300;

            int a = x;
            x = y;
            y = z;
            z = a;

            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);
        }

}
