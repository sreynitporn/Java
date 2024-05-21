package Project.StudentManagmentSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentService{
        private List<Student> students;

        public void StudentSevice() {
            students = new ArrayList<>();
        }

        public void displayAllStudents() {
            for (Student student : students) {
                System.out.println(student);
            }
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void updateStudent(int studentId, Student updatedStudent) {
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                if (student.getId() == studentId) {
                    students.set(i, updatedStudent);
                    break;
                }
            }
        }

        public void removeStudent(int studentId) {
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                if (student.getId() == studentId) {
                    students.remove(i);
                    break;
                }
            }
        }

        public Student searchStudentById(int studentId) {
            for (Student student : students) {
                if (student.getId() == studentId) {
                    return student;
                }
            }
            return null;
        }

        public List<Student> searchStudentsByName(String name) {
            List<Student> searchResults = new ArrayList<>();
            for (Student student : students) {
                if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                    searchResults.add(student);
                }
            }
            return searchResults;
        }
}
