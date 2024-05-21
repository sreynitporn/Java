package collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(
                1,
                "Koko",
                "MAle"
        ));
        studentList.add(new Student(
                2,
                "Ka ka",
                "Female"
        ));
        System.out.println(studentList);
        // for search
       studentList.stream()
               .filter(e->e.getId().equals(1))
               .forEach(e->{
                   e.setName("Kwan");
                   e.setGender("Male");
               });
        System.out.println(studentList);
    }
}
