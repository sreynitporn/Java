package File;

import java.io.FileInputStream;

public class FileInputstream2 {
   public static void main(String[] args){
       try{
           FileInputStream reader =new FileInputStream("email.dat");
           int a;
           StringBuilder stringBuilder= new StringBuilder();
           while ((a=reader.read())!=-1){
               stringBuilder.append((char) a);
           }
           System.out.println(stringBuilder);
       }catch (Exception ignore){};
   }
}
