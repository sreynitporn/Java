package Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.UUID;

public class Main {
    public static void main(String[] args){
        try{
            BufferedWriter writer= new BufferedWriter(new FileWriter("output/data.csv",true));
            User user1 = new User();
            user1.setUuid(UUID.randomUUID().toString());
            user1.setUserName("Na Na");
            user1.setEmail("Nit54@46.gmail.com");
            user1.setPassword("#@###");
            user1.setIsDelete(false);
            String data = user1.getUuid()+","
                    +user1.getUserName()+","
                    +user1.getEmail()+","
                    +user1.getPassword()+","
                    +user1.getIsDelete()+"\n";
            writer.write(data);
            writer.close();
            System.out.println("[+] User has been added newly successfully.");
        } catch (Exception ignore){};
    }
}
