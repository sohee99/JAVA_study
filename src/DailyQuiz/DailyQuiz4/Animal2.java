package DailyQuiz.DailyQuiz4;

public class Animal2 {

    String name;

    Animal2(String name){ //생성자 생성
        this.name = name;
    }

    void  setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void sleep(){
        System.out.println(name + " 가 자고있다. ");
    }
}
