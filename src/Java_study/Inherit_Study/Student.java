package Java_study.Inherit_Study;

public class Student extends Person{
    int studentNo;

    /* 부모클래스에 만약 생성자가 없다면
    Student(){
        super(); // super 맨첫줄에 선언해야한다.
    }
     */

    public Student(String name, String ssn, int studentNo) { //매개변수를 생성함으로서 디폴트 생성자는 x
//        super(name, ssn);
        //원래 부모클래스의 디폴트 생성자를 호출해야하는데
        // 부모클래스에 존재 x 그리하여 매개변수가 있는 생성자를 호출해야한다.
        this.studentNo = studentNo;
    }
}

