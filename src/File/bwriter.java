package File;

import org.nocrala.tools.texttablefmt.Table;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class bwriter{
   public static void main(String[] args){
       try {
           BufferedReader bufferedReader=new BufferedReader(new FileReader("output/data.csv"));
           String data;
           Table table=new Table(5);

           table.addCell("UUID");
           table.addCell("User Name");
           table.addCell("Email");
           table.addCell("Password");
           table.addCell("IS Delete");
           while((data=bufferedReader.readLine())!=null){
            String[] result=data.split(",");
               //System.out.println(Arrays.toString(result));
               table.addCell(result[0],1);
               table.addCell(result[1],1);
               table.addCell(result[2],1);
               table.addCell(result[3],1);
               table.addCell(result[4],1);
           }
           System.out.println(table.render());
       }catch (Exception ignore){

       };
   }

}
