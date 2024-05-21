package OOP.Abstraction;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args){
        Email email=new Email();

        email.setDescription("hello");
        email.setTopic("jaad");
        email.setSentData(LocalDate.now());
        System.out.println(email);
    }
}
