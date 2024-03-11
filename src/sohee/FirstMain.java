public class FirstMain {
    public static void main(String[] args) {
        int value = 10;

        if(value == 10){
            int value2 = 11;
            System.out.println(value2);
        }

        for (int i = 0; i < 5; i++){
            int value2 = 1;
            System.out.println(value + 1);
            System.out.println(value2 + 1);
        }
        /* if 문의 value2와 for 문의 value2는 다른 value2이다
            value2는 value 와 다르게 {} 내에서 선언하였기에 생명주기는 {} 실행되고 사라진다.
         */

        System.out.println(value);
        // 생명주기는 메소드블록에서 끝났기 때문에 value2 사용 불가능!
    }

    //    public static void main(String[] args) {
//        // 실수값 저장.
//        double var1 = 3.14;
//        float var2 = 3.14F;
//
//        // 정밀도 테스트.
//        double var3 = 0.1234567890123456789;
//        float var4 = 0.1234567890123456789F;
//
//        System.out.println(var1);
//        System.out.println(var2);
//        System.out.println(var3);
//        System.out.println(var4);
//    }}


    }
