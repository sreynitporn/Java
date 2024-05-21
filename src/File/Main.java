package File;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] arg){
        try{
            FileOutputStream writer= new FileOutputStream("Nj.txt",true);
            writer.write("Hello word\n".getBytes());
            System.out.println("Create successfully!");
            writer.close();
        }catch (Exception ignore){}
    }
}