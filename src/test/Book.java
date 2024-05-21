import java.time.LocalDate;
import java.util.UUID;

public class Book {
    private String  uuid;
    private String title;
    private String author;
    private String gender;
    private int page;
    private LocalDate publicSheDate;

    public Book(String uuid, String title, String author, String gender, int page, LocalDate publicSheDate){
        this.uuid=uuid;
        this.title=title;
        this.author=author;
        this.gender=gender;
        this.page=page;
        this.publicSheDate=publicSheDate;
    }

    public Book() {

    }

    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid){
        this.uuid=uuid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public LocalDate getPublicSheDate() {
        return publicSheDate;
    }
    public void setPublicSheDate(LocalDate publicSheDate) {
        this.publicSheDate = publicSheDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Uuid=" +uuid+
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", gender='" + gender + '\'' +
                ", page=" + page +
                ", publicSheDate=" + publicSheDate +
                '}';
    }
}
