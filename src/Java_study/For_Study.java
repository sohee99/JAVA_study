package Java_study;
public class For_Study {

/* for 문

   public static void main(String[] args) {
    //1~5까지 출력
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
    System.out.println(4);
    System.out.println(5);
           //초기화식, 조건문, 증감식
      for (int i = 1; i <= 5; i++) { //0,1,2,3,4,5
      System.out.println(i);
      }
    }

Q.for 문 실습 1~10까지 출력값 나오게 하시오.

    public static void main(String[] args) {
            for(int i =1; i < 11; i++){
                System.out.println(i);
        }
    }

배열 + for 문

    public static void main(String[] args) {
        //[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]
        int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

for each 문

    public static void main(String[] args) {
        int[] array = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        for(int arr : array){
            System.out.println(arr);
        }

        String[] numbers = {"one", "two", "three", "four"};
        for(String element : numbers){
            System.out.println(element);
        }

    }

    int index = 0;
    for(int score : marks){
        index += index + 1;
        if( score < 50) {
            continue;
            }
            System.out.println(index + "번 학생 합격 축하축하!!");

for 문으로 돌아가기 - continue

    public static void main(String[] args) {
            int[] marks = {90, 25, 67, 45, 80};

            for (int i = 0; i < marks.length; i++) {
                if (marks[i] < 70) {
                    continue;
                }
                System.out.println((i + 1) + "번 학생, 축하합니다 합격입니다!");
            }
     }

Q. 50점 이상인 학생을 합격 처리한다.
    public static void main(String[] args) {
        int[] grade = {90, 25, 67, 45, 80};

        for (int i = 0; i< grade.length; i++){
            if (grade[i] < 50){
                continue;
            }
            System.out.println((i + 1) + "번 학생, 축하합니다 합격입니다!");
        }
    }
}
이중 for 문

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {  // i = 0, 1, 2
            for (int j = 0; j < 4; j++) {  // j = 0, 1, 2, 3
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }

Q. 구구단 2단부터 9단까지 만들어보자!
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.println(i + "*" + j + "=" + (i*j));
            }
        }
    }
*/




}