package enums;

import static enums.Book.BookGenreNews.HORROR;

/**
 * Created by amitagarwal3 on 8/21/2017.
 */
public class Book {


    public enum BookGenreNews {
        BIOGRAPHY(12),
        HORROR(15);

        private BookGenreNews(int minAgeToRead){
            this.minAgeToRead = minAgeToRead;
        }

        private int minAgeToRead;
        public int getMinAgeToRead(){
            return this.minAgeToRead;
        }



    }

    public static void main(String[] args){

        for(BookGenreNews bookGenre: BookGenreNews.values()){
            System.out.println(bookGenre);
            System.out.println(bookGenre.name());
            System.out.println(bookGenre.getDeclaringClass());
            System.out.println(bookGenre.ordinal());
            System.out.println(bookGenre.compareTo(BookGenreNews.HORROR));
            System.out.println(bookGenre.equals(BookGenreNews.HORROR));

            System.out.println("Min AGe to read "+bookGenre.getMinAgeToRead());
        }
    }
}
