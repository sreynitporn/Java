package OOP.Inheritancesd;

import java.time.LocalDate;
import java.util.UUID;

public class Min2 {
    public static void main(String[] args){
        TextBook srunNgoun= new TextBook(
                UUID.randomUUID().toString(),"HistoryKhmer",
                new String[]{"NaNa"," Dara"},500,
                LocalDate.of(2023,12,12)
        );
        srunNgoun.detail();
    }
}
