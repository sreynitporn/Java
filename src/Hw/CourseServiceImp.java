package Hw;

import Arrays.Str;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class CourseServiceImp implements CourseService {
    @Override
    public void addNewCourse() {
        try{
            Scanner scanner=new Scanner(new File("gv/input.csv"));
            BufferedWriter writer= new BufferedWriter(new FileWriter("gv/course.csv"));
            System.out.println("Enter the course title:");
            String title = scanner.nextLine();
            Integer id= scanner.nextInt();
            LocalDate date = LocalDate.now();
            boolean isAvailable=true;

            Course course=new Course(id,title,date.toString(),null,isAvailable);
            writer.write(courseToString(course));
            writer.newLine();
            writer.close();
            System.out.println("new course added successfully");

        }catch (Exception ignore){};

    }

    @Override
    public void getAllCourse() {

    }

    @Override
    public void getCourseById() {

    }
    private String courseToString(Course course){
        return course.getCourseId()+","+
                course.getCourseTitle()+","+
                course.getCourseStartDate()+","+
                course.getCourseEndedDate()+","+
                course.getIsAvailable();
    }

}
