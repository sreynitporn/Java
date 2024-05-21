package Project.StudentManagmentSystem;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Student Management System");
            System.out.println("-------------------------");
            System.out.println("1. Display all students");
            System.out.println("2. Add new student");
            System.out.println("3. Update student");
            System.out.println("4. Remove student");
            System.out.println("5. Search for student by ID");
            System.out.println("6. Search for student by name");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    studentService.displayAllStudents();
                    break;
                case 2:
                    Student newStudent = readStudentFromInput(scanner);
                    studentService.addStudent(newStudent);
                    System.out.println("Student added successfully.");
                    break;
                case 3:
                    System.out.print("Enter the student ID to update: ");
                    int studentIdToUpdate = new Scanner(System.in).nextInt();

                    Student updatedStudent = readStudentFromInput(scanner);
                    studentService.updateStudent(studentIdToUpdate, updatedStudent);
                    System.out.println("Student updated successfully.");
                    break;
                case 4:
                    System.out.print("Enter the student ID to remove: ");
                    int studentIdToRemove = new Scanner(System.in).nextInt();
                    studentService.removeStudent(studentIdToRemove);
                    System.out.println("Student removed successfully.");
                    break;
                case 5:
                    System.out.print("Enter the student ID to search: ");
                    int studentIdToSearch = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    Student foundStudent = studentService.searchStudentById(studentIdToSearch);
                    if (foundStudent != null) {
                        System.out.println("Found student: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter the student name to search: ");
                    String studentNameToSearch = scanner.nextLine();
                    List<Student> searchResults = studentService.searchStudentsByName(studentNameToSearch);
                    if (!searchResults.isEmpty()) {
                        System.out.println("Search results:");
                        for (Student student : searchResults) {
                            System.out.println(student);
                        }
                    } else {
                        System.out.println("No students found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }

    private static Student readStudentFromInput(Scanner scanner) {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student classroom: ");
        String classroom = scanner.nextLine();

        System.out.print("Enter enrolled subjects (comma-separated): ");
        String subjects = scanner.nextLine();

        return new Student();
    }
}