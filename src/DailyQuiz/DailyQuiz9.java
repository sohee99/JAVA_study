package DailyQuiz;

public class DailyQuiz9 {
/*
    1. 제네릭에 대한 설명으로 틀린 것은 무엇입니까? 4

            1) 컴파일시 강한 타입 체크를 할 수 있다.

            2) 타입 변환(casting)을 제거한다.

            3) 제네릭 타입은 타입 파라미터를 가지는 제네릭 클래스와 인터페이스를 말한다.

            4) 제네릭 메소드는 리턴 타입으로 타입 파라미터를 가질 수 없다.

    2. ContainerExample 클래스의 main() 메소드는 Container 제네릭 타입을 사용하고 있습니다.
        main() 메소드에서 사용하는 방법을 참고해서 Container 제네릭 타입을 선언해보세요.

           public class Container<T> {

             private T name;

             void set(T name) {
             this.name = name;
             }

             T get(){
             return name;
             }
          }

   3. TwoContainerExample 클래스의 main() 메소드는 TwoContainer 제네릭 타입을 사용하고 있습니다.
       main() 메소드에서 사용하는 방법을 참고해서 TwoContainer 제네릭 타입을 선언해보세요.

      public class TwoContainerExample {

	  public static void main(String[] args) {
		TwoContainer<String, String> container = new TwoContainer<>();
		container.set("홍길동", "도적");
		String name = container.getKey();
		String job = container.getValue();

		TwoContainer<String, Integer> secondContainer = new TwoContainer<>();
		secondContainer.set("홍길동", 35);
		String name2 = secondContainer.getKey();
		Integer age = secondContainer.getValue();
	    }
    }

    public class TwoContainer<T, M> {
    private T key;
    private M value;

    void set(T key, M value) {
        this.key = key;
        this.value = value;
    }
    public T getKey(){
        return key;
    }

    public M getValue(){
        return value;
    }

  4. Util.getValue() 메소드는 첫 번째 매개값으로 Pair 타입과 하위 타입만 받고, 두 번째 매개값으로 키를 받습니다.
     리턴값은 키값이 일치할 경우 Pair에 저장된 값을 리턴하고,
     일치하지 않으면 null을 리턴하도록 getValue() 제네릭 메소드를 정의해보세요.

     public class Util{

    public static <T extends Pair, M> Integer getValue(T pair, M key){
        if(pair.getKey().equals(key)){
            return (Integer) pair.getValue();
        }
        else{
            return null;
            }
        }
    }

}

 */
}
