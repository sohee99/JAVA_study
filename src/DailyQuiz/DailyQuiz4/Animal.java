package DailyQuiz.DailyQuiz4;

public class Animal {

    String name; //필드선언

    String sleep;

    Animal(){
        name = "cheese";
        sleep = "no sleeping";
    }


    public void setName(){
        this.name = name;
    }

    String getName(){
        return name;
    }


    Animal(String name, String sleep){
        this.name = name;
        this.sleep = sleep;
    }

    void PrintSpec(){
        System.out.println( "Name : " + name + " sleep : " + sleep);
    }

}

