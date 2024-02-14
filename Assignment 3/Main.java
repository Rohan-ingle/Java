import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student (by PRN)");
            System.out.println("4. Update/Edit Student");
            System.out.println("5. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter PRN, Name, DoB, Marks respectively : ");
                    String prn = scanner.next();
                    String name = scanner.next();
                    String dob = scanner.next();
                    double marks = scanner.nextDouble();
                    management.addStudent(prn, name, dob, marks);
                    break;
                case 2:
                    management.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter PRN to search: ");
                    prn = scanner.next();
                    Student foundStudent = management.searchByPrn(prn);
                    if (foundStudent != null) {
                        foundStudent.display();
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter PRN to update: ");
                    prn = scanner.next();
                    System.out.print("Enter new Name, new DoB, new Marks: ");
                    name = scanner.next();
                    dob = scanner.next();
                    marks = scanner.nextDouble();
                    management.updateStudent(prn, name, dob, marks);
                    break;
                case 5:
                    System.out.print("Enter PRN to delete: ");
                    prn = scanner.next();
                    management.deleteStudent(prn);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid one.");
            }
        } while (choice != 0);

        scanner.close();
    }
}