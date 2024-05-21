package OOP.Inheritancesd;

import java.time.LocalDate;
import java.util.Arrays;

public class Book {
    public String uuid;
    public String title;
    public String[] author;
    public Integer numberOfPage;
    public LocalDate publishedDate;
    public Book(){}
    public Book(String uuid,String title,String[] author,Integer numberOfPage,LocalDate publishedDate)
    {
        this.uuid=uuid;
        this.title=title;
        this.author=author;
        this.numberOfPage=numberOfPage;
        this.publishedDate=publishedDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "uuid='" + uuid + '\'' +
                ", title='" + title + '\'' +
                ", author=" + Arrays.toString(author) +
                ", numberOfPage=" + numberOfPage +
                ", publishedDate=" + publishedDate +
                '}';
    }
}
