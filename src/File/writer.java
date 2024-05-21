package File;

import java.io.FileWriter;

public class writer {
    public static void main(String[] args){
        try{
            FileWriter fileWriter= new FileWriter("File.txt");
            fileWriter.write("Good Afternoon");
            fileWriter.close();
        }catch (Exception ignore){
            System.out.println(ignore.getMessage());

        }
    }
}
