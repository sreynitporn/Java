package Hw;

import java.io.BufferedReader;
import java.io.FileReader;

public class View {
    public static void menu() {
        try {
            BufferedReader reader= new BufferedReader(new FileReader("course.csv"));
            CourseServiceImp courseServiceImp = new CourseServiceImp();
            int choice = 0;

            do {
                System.out.println("\nCourse Management System");
                System.out.println("1. Add new course");
                System.out.println("2. Get all courses");
                System.out.println("3. Search course by ID");
                System.out.println("4. Exit");
                System.out.println("Enter your choice:");
                choice = Integer.parseInt(reader.readLine());

                switch (choice) {
                    case 1:
                        courseServiceImp.addNewCourse();
                        break;
                    case 2:
                        courseServiceImp.getAllCourse();
                        break;
                    case 3:
                        courseServiceImp.getCourseById();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 4);
            System.out.println("successfully");
        } catch (Exception ignore) {};
    }


}
