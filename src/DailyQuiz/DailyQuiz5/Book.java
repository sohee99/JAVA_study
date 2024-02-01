package DailyQuiz.DailyQuiz5;

public class Book extends Item{

    String author;

    String isbn;

    public Book(String id, String name, int price, String author, String isbn){
        super(id,name,price);
        this.author = author;
        this.isbn = isbn;
    }
    public void println(){
        System.out.println("ID:"+id+"이름:"+name+"price :"+price+"작가:"+author+"ISBN:"+isbn);
    }
}
