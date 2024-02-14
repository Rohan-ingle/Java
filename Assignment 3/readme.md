Student Management System
Overview

This Java application serves as a simple Student Management System, designed to manage student records. It demonstrates the use of classes, objects, ArrayLists, instance members, and constructors in Java. The system allows users to perform operations such as adding, displaying, searching, updating, and deleting student records.
Classes and Their Functions
1. Student Class

The Student class represents a student entity with attributes and methods to manage individual student details.
Attributes

    prn: A String representing the Personal Registration Number of the student.
    name: A String containing the student's name.
    dob: A String representing the student's Date of Birth in the format DD/MM/YYYY.
    marks: A double value indicating the student's marks.

Methods

    Student(String prn, String name, String dob, double marks): Constructor to initialize a student object with provided details.
    display(): Prints the student's details to the console.

2. StudentManagement Class

The StudentManagement class is responsible for managing an array of Student objects, providing functionalities to add, display, search, update, and delete student records.
Attributes

    students: An ArrayList<Student> that stores the list of student objects.

Methods

    addStudent(String prn, String name, String dob, double marks): Adds a new student to the list.
    displayStudents(): Displays details of all students in the list.
    searchByPrn(String prn): Returns a Student object matching the given PRN. If not found, returns null.
    searchByName(String name): Returns a Student object matching the given name. If not found, returns null.
    updateStudent(String prn, String newName, String newDob, double newMarks): Updates the details of the student with the specified PRN.
    deleteStudent(String prn): Deletes the student with the specified PRN from the list.

3. Main Application Class

The main class provides a menu-driven interface for users to interact with the student management system.
Main Method

    main(String[] args): The entry point of the application. It presents a menu to the user and performs actions based on the user's choice, utilizing the StudentManagement class's methods.