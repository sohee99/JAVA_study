package Java_study.Final_study;

public class Person {
        // final 은 값이 바뀌면 x
        final String nation = "korea"; // 필드 안에서 초기화 가능
        final String name;

        Person(String name){
            this.name = name; //생성자 안에서 초기화 할 수있는 것
        }

        Person(){
            //디폴트생성자를 쓰게되면 필드의 final 초기화가 되지 않음.
            this.name = "초기이름생성";
        }
    }

