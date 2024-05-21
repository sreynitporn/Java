package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Student> list=new ArrayList<>(
                List.of(new Student(1,"nana"),
                        new Student(2,"Nit")
                )
        );
        list.forEach(System.out::println);
        System.out.print("[+] Insert id to Search:");
        Integer id =new Scanner(System.in).nextInt();
        System.out.println("[+] Insert name to Search:");
        String name=new Scanner(System.in).nextLine();
        list.stream()
                .filter(e->e.getId().equals(id))
                .filter(e->e.getName().equals(name))
                .forEach(e-> System.out.println(e));
    }
}
