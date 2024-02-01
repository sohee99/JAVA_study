package DailyQuiz.DailyQuiz5;

public class ItemManager {


    public static void main(String[] args) {
        Album album = new Album("Album", "다시만난세계",15000,"소녀시대");
        Movie movie = new Movie("Movie", "30일",10000,"남대중","강하늘,정소민");
        Book book = new Book("Book","돌이킬 수 없는 약속",16500,"야쿠마루 가쿠","9788998274795");
        album.println();
        movie.println();
        book.println();
    }


}
