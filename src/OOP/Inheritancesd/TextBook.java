package OOP.Inheritancesd;
import java.time.LocalDate;
import java.util.Arrays;

public class TextBook extends Book {
    public TextBook(String uuid, String title, String[] author, Integer numberOfPage, LocalDate publishedDate){
        super(uuid,title,author,numberOfPage,publishedDate);
    }
    public void detail(){
        System.out.println("Book uuid:"+super.uuid);
        System.out.println("Book title:"+super.title);
        System.out.println("Book author:"+ Arrays.toString(super.author));
        System.out.println("Book numberOfPage:"+super.numberOfPage);
        System.out.println("Book publishedDate:"+super.publishedDate);
    }

}
