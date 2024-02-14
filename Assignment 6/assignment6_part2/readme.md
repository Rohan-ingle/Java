Student Result Calculation System

This Java-based project, located within the assignment6_part2 package, is designed to calculate and display the percentage of marks obtained by a student across five subjects. It leverages an interface called Exam for defining the percent_cal method, which is implemented by the Result class extending the Student base class.
Components
Interface: Exam

Defines the essential method for percentage calculation:

    percent_cal(): Calculates and returns the percentage of marks.

Class: Student

Serves as the base class containing student details:

    Attributes: name, rollNumber, mark1, mark2, mark3, mark4, mark5.
    Constructor: Initializes a student with name, roll number, and marks for five subjects.
    Getters and Setters: For each attribute.

Class: Result

Extends Student and implements Exam, providing functionalities to calculate and display the percentage of marks:

    Constructor: Calls the base class constructor.
    percent_cal(): Implements the percentage calculation logic.
    display(): Displays student details along with the calculated percentage.

Class: TestStudent

Contains the main method to run the application:

    Prompts the user to input student details and marks for five subjects.
    Creates a Result object and displays the calculated percentage.