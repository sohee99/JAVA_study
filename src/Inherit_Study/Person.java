package Inherit_Study;

public class Person {
    String name;
    String ssn;

    public Person(){}


    public Person(String name, String ssn) { //매개변수가 있는 생성자를 생성 시 디폴트 생성자로 호출 불가
        this.name = name;
        this.ssn = ssn;
    }
}
