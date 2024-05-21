package Project.Hw2;

import org.nocrala.tools.texttablefmt.Table;

import java.io.*;
import java.util.*;

public class CourseServiceImp implements CourseService{
    Course course = new Course();
    @Override
    public void addNewCourse() {
            try {
                Scanner scanner=new Scanner(System.in);
                BufferedWriter writer= new BufferedWriter(new FileWriter("outputCourse/course.csv",true));
                int courseId=generateCourseId();
                course.setCourseID(courseId);
                System.out.print("Enter the course title:");
                course.setCourseTitle(scanner.nextLine());
                System.out.print("Enter courseStartDate:");
                course.setCourseStartDate(scanner.nextLine());
                System.out.print("Enter courseEndedDate:");
                course.setCourseEndedDate(scanner.nextLine());
               // LocalDate date=LocalDate.now();
                boolean isAvailable=true;

                String data = course.getCourseID()+","+course.getCourseTitle()+","+course.getCourseStartDate()+","+course.getCourseEndedDate()+","+isAvailable+"\n";
                writer.write(data);
                writer.flush();
                writer.close();
                System.out.println("Add NewCourse Successfully!");
            }catch (Exception ignore){
                ignore.printStackTrace();
            };
    }

    @Override
    public void getAllCourse() {
        try {
            BufferedReader bufferedReader= new BufferedReader(new FileReader("outputCourse/course.csv"));
            String data;
            Table table=new Table(5);
            for(int i=0;i<5;i++){
                table.setColumnWidth(i,20,20);
            }
            table.addCell("courseID");
            table.addCell("courseTitle");
            table.addCell("courseStartDate");
            table.addCell("courseEndedDate");
            table.addCell("isAvailable");

            while((data=bufferedReader.readLine())!=null){
                String[] result = data.split(",");
                //System.out.println(Arrays.toString(result));
                table.addCell(result[0],1);
                table.addCell(result[1],1);
                table.addCell(result[2],1);
                table.addCell(result[3],1);
                table.addCell(result[4],1);
            }
            bufferedReader.close();
            System.out.println(table.render());
            System.out.println("All Course successfully for Reading!");
        }catch (Exception ignore){
            ignore.printStackTrace();
        };
    }
    @Override
    public void getCourseById() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("outputCourse/course.csv"));
            String data;
            System.out.print("Enter the course ID: ");
            int courseId =new Scanner(System.in).nextInt();

            Table table = new Table(5);
            for (int i = 0; i < 5; i++) {
                table.setColumnWidth(i, 20, 20);
            }
            table.addCell("courseID");
            table.addCell("courseTitle");
            table.addCell("courseStartedDate");
            table.addCell("courseEndedDate");
            table.addCell("isAvailable");
            boolean courseFound = false;
            while ((data = bufferedReader.readLine()) != null) {
                String[] result = data.split(",");
                Integer id = Integer.parseInt(result[0]);
                if (id==courseId) {
                    table.addCell(result[0], 1);
                    table.addCell(result[1], 1);
                    table.addCell(result[2], 1);
                    table.addCell(result[3], 1);
                    table.addCell(result[4], 1);
                    courseFound = true;
                    break;
                }
            }
            if (courseFound) {
                System.out.println(table.render());
            } else {
                System.out.println("Course not found!");
            }
            bufferedReader.close();
            System.out.println("Course search completed!");
        } catch (Exception ignore) {
            ignore.printStackTrace();
        };
    }
    private int generateCourseId() {
        int maxId = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("outputCourse/course.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int courseId = Integer.parseInt(parts[0]);
                if (courseId > maxId) {
                    maxId = courseId;
                }
            }
        } catch (Exception ignore) {
            System.out.println("Failed to read course data from file.");
        }

        return maxId + 1;
    }

}
