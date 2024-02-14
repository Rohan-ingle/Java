public class Student {
    String prn;
    String name;
    String dob;
    double marks;

    // Constructor
    public Student(String prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    // Display student details
    public void display() {
        System.out.println("PRN: " + prn + ", Name: " + name + ", DoB: " + dob + ", Marks: " + marks);
    }
}
