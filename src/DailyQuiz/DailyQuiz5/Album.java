package DailyQuiz.DailyQuiz5;

public class Album extends Item{


    String artist;

    public Album(String id, String name, int price, String artist){
        super(id,name,price);
        this.artist = artist;
    }

    public void println(){
        System.out.println("ID:"+id+"이름:"+name+"price :"+price+"작곡가:"+artist);
    }
}
