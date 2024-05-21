package Collection;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HashMap<String,Dictionary>hashMap=new HashMap<>();
        Dictionary dictionary=new Dictionary(1,"Apple","noun","is a fruit");
        Dictionary banana=new Dictionary(2,"banana","noun","is a fruit");
        hashMap.put("apple",dictionary);
        hashMap.put("banana",banana);
        System.out.println("Insert word:");
        String word = new Scanner(System.in).nextLine();
        System.out.println(hashMap.get(word.toLowerCase()));

    }
}
