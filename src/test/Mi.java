import java.time.LocalDate;
import java.util.UUID;

public class Mi {

    public static void main(String[] args){
       // Book srunNgoun = new Book(
        //                UUID.randomUUID(),
        //                "java",
        //                "programing",
        //                "M",
        //                300,
        //                LocalDate.of(2020,4,23)
        //        );
        //        System.out.println(srunNgoun);
        Book[] books=new Book[2];
        books[0]=new Book(UUID.randomUUID().toString(),
                "c++",
                "Programming",
                "M",
                300,
                LocalDate.of(2020,2,3)
        );
        books[1]=new Book();
        books[1].setUuid(UUID.randomUUID().toString());
        books[1].setTitle("java");
        books[1].setAuthor("Game Gisling");
        books[1].setGender("programming");
        books[1].setPage(100);
        books[1].setPublicSheDate(LocalDate.now());
        for(Book book:books){
            System.out.println(book);
        }
    }
}
