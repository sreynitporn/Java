import java.util.ArrayList;
import java.util.List;

public class Str {
    public static  void main(String[] args){
        List<String>stringList=new ArrayList<>();
        stringList.add("Nana");
        stringList.add("kaka");
        for(int i=0;i<stringList.size();i++){
            System.out.println(stringList.get(i));
        }
        System.out.println("===========");
        for(String name: stringList){
            System.out.println(name);
        }
        System.out.println("=".repeat(20));
        stringList.forEach(System.out::println);

    }
}
