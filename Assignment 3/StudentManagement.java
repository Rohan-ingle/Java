import java.util.ArrayList;

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String prn, String name, String dob, double marks) {
        Student student = new Student(prn, name, dob, marks);
        students.add(student);
    }

    public void displayStudents() {
        for (Student student : students) {
            student.display();
        }
    }

    public Student searchByPrn(String prn) {
        for (Student student : students) {
            if (student.prn.equals(prn)) {
                return student;
            }
        }
        return null;
    }

    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.name.equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(String prn, String newName, String newDob, double newMarks) {
        Student student = searchByPrn(prn);
        if (student != null) {
            student.name = newName;
            student.dob = newDob;
            student.marks = newMarks;
        } else {
            System.out.println("Student not found!");
        }
    }

    public void deleteStudent(String prn) {
        students.removeIf(student -> student.prn.equals(prn));
    }
}
