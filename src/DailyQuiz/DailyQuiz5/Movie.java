package DailyQuiz.DailyQuiz5;

public class Movie extends Item{

    String director;

    String actor;

    public Movie(String id, String name, int price, String director, String actor){
        super(id,name,price);
        this.director = director;
        this.actor = actor;
    }

    public void println(){
        System.out.println("ID:"+id+"이름:"+name+"price :"+price+"감독:"+director+"배우:"+actor);
    }
}
