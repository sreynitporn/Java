package File;

import java.io.FileOutputStream;

public class FileOutputStream1 {
    public static void main(String[] args){
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("email.dat" ,true);
            String email= "Email:nit2467@gmail.com \n";
            fileOutputStream.write(email.getBytes());
            fileOutputStream.close();
            System.out.println("successfully wrote data");

        }catch(Exception ignore){}
    }
}
