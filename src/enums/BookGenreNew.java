package enums;

/**
 * Created by amitagarwal3 on 8/21/2017.
 */
public enum BookGenreNew {
    BIOGRAPHY(12),
    HORROR(15);

    private BookGenreNew(int minAgeToRead){
        this.minAgeToRead = minAgeToRead;
    }

    private int minAgeToRead;
    public int getMinAgeToRead(){
        return this.minAgeToRead;
    }

    public static void main(String[] args){

        for(BookGenreNew bookGenre: BookGenreNew.values()){
            System.out.println(bookGenre);
            System.out.println(bookGenre.name());
            System.out.println(bookGenre.getDeclaringClass());
            System.out.println(bookGenre.ordinal());
            System.out.println(bookGenre.compareTo(HORROR));
            System.out.println(bookGenre.equals(HORROR));

            System.out.println("Min AGe to read "+bookGenre.getMinAgeToRead());
        }
    }

}
