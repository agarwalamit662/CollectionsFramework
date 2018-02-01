package enums;

/**
 * Created by amitagarwal3 on 8/21/2017.
 */
public enum BookGenre {
    BIOGRAPHY,
    HORROR;

    public static void main(String[] args){

        for(BookGenre bookGenre: BookGenre.values()){
            System.out.println(bookGenre);
            System.out.println(bookGenre.name());
            System.out.println(bookGenre.getDeclaringClass());
            System.out.println(bookGenre.ordinal());
            System.out.println(bookGenre.compareTo(HORROR));
            System.out.println(bookGenre.equals(HORROR));
        }
    }

}
