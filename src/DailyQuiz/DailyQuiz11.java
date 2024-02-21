package DailyQuiz;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DailyQuiz11 {
/*
    public static class PrintMoreBigNumber {

        public List<Integer> solution(int n, int[] array) {
            List<Integer> answer = new ArrayList<>();

            // 코드 작성
            answer.add(array[0]);
            for(int i = 0; i < n; i++){
                if(array[i] > array[i - 1] ){
                    answer.add(array[i]);
                }
            }
            return answer;

            //stream
            answer.add(array[0]);
            List<Integer> collect = IntStream.range(1,n) // 1~n-1까지 돈다
                    .filter(index -> array[index] > array[index -1])
                    .mapToObj( x -> array[x])
                    .toList();

            answer.addAll(collect);
            return  answer;
        }

        public static void main(String[] args) {
            PrintMoreBigNumber printMoreBigNumber = new PrintMoreBigNumber();
            Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();
            int[] array = new int[number];

            for (int i = 0; i < number; i++) {
                array[i] = scanner.nextInt();
            }

            for (int x : printMoreBigNumber.solution(number, array)) {
                System.out.print(x + " ");
            }
        }
    }

    2. 두 배열 합치기

        오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성해보세요.

        public static class AscendingSort {
		public int[] solution(int[] array1, int[] array2) {
				int[] result = new int[array1.length + array2.length];


           // 3
           // 1 3 5 (array1) i
           // 5
           // 2 3 6 7 9 (array2) j
           // 출력예제 1
           // 1 2 3 3 5 6 7 9 index


            // 코드 작성
                int index = 0; int i = 0; int j = 0;
                while ( i < array1.length && j < array2.length){
                    if(array1[i] < array2[j]){
                        result[index] = array1[i];
                        index++; i++;
                    }else{
                        result[index] = array2[j];
                        index++; j++;
                    }
                }

                while (i < array1.length){
                    result[index] = array1[i];
                    index++; i++;
                }
                while (j < array2.length){
                    result[index] = array2[j];
                    index++; j++;
                }

                return result;



                //stream
                return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                            .sorted()
                            .toArray();


		}

		public static void main(String[] args) {
        AscendingSort ascendingSort = new AscendingSort();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}
 */


}
