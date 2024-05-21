package File;

import java.io.FileWriter;

public class FileWriter1 {
    public static void main(String[] args){

        try{
            FileWriter writer= new FileWriter("email.dat",true);
            String email = "Email: Nit235@gmail.com";
        }catch (Exception ignore){};
    }
}
