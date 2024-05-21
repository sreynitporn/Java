package File;

import java.io.FileInputStream;

public class FileInput {
    public static void main(String[] args)
    {
        try{
            FileInputStream reader = new FileInputStream("Nj.txt");
                int a;
                while ((a=reader.read())!=-1){
                    System.out.println((char) a);
                }
        }catch (Exception ignore){
            System.out.println(ignore.getMessage());
        }
    }
}
