package Project.Hw2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class View {
        public static void menu() {
                CourseService courseService = new CourseServiceImp();
                int choice = 0;
                do {
                    System.out.println("\nCourse Management System");
                    System.out.println("1. Add new course");
                    System.out.println("2. Get all courses");
                    System.out.println("3. Search course by ID");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice:");
                    choice = new Scanner(System.in).nextInt();

                    switch(choice){
                        case 1:
                            courseService.addNewCourse();
                            break;
                        case 2:
                            courseService.getAllCourse();
                            break;
                        case 3:
                            courseService.getCourseById();
                            break;
                        case 4:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } while (choice != 4);

        }

}
