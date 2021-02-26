
/**
 * ObjectsIntro is here is introduce objects.
 *
 * @author (Ms. Schulze)
 * @version (1.0)
 */

import java.util.Scanner;

public class Student
{
    String name;
    int id;
    String department;
    double gpa;
    
    static void clearScreen() {
        System.out.print('\u000C');
    }
    
    // Define parameters for the Student object
    public Student(String newName, int newId, String newDepartment, double newGPA) {
        name = newName;
        id = newId;
        department = newDepartment;
        gpa = newGPA;
    }
    
    public void setStudent(String newName, int newId, String newDepartment, double newGPA) {
        name = newName;
        id = newId;
        department = newDepartment;
        gpa = newGPA;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public double getGPA() {
        return gpa;
    }
    
    static void print(String toPrint) {
        System.out.println(toPrint);
    }
    
    static Student inputStudentData() {
        // Initialize Input Scanner
        Scanner key = new Scanner(System.in);
        
        // Initialize Variables
        String inputName;
        int inputId;
        String inputDepartment;
        float inputGPA;
        
        System.out.print("Input the student's name:  ");
        inputName = key.next();
        
        System.out.print("Input the student's id:  ");
        inputId = key.nextInt();
        
        System.out.print("Input the student's department:  ");
        inputDepartment = key.next();
        
        System.out.print("Input the student's GPA:  ");
        inputGPA = key.nextFloat();
        
        Student thisStudent = new Student(inputName, inputId, inputDepartment, inputGPA);
        
        thisStudent.setStudent(inputName, inputId, inputDepartment, inputGPA);
        
        return thisStudent;
    }
    
    public void printStudentInfo() {
        System.out.println();
        System.out.println("Here's the student's information.");
        System.out.println("Name:  " + name);
        System.out.println("ID:  "  + id);
        System.out.println("Department:  " + department);
        System.out.println("GPA:  " + gpa);
    }
    
    public static void main(String[] args) {
        // Clear Screen
        clearScreen();
        
        // Initialize Input Scanner
        Scanner key = new Scanner(System.in);
        
        /// Initialize Student
        Student newStudent = new Student("name", 1, "department", 0.0);
        
        // Initialize Variables
        String inputName;
        int inputId;
        String inputDepartment;
        float inputGPA;
        
        // Introductory greeting
        System.out.println("Welcome, Classy Student, to the Student class.");
        
        // Input a new student
        System.out.print("Input the student's name:  ");
        inputName = key.next();
        
        System.out.print("Input the student's id:  ");
        inputId = key.nextInt();
        
        System.out.print("Input the student's department:  ");
        inputDepartment = key.next();
        
        System.out.print("Input the student's GPA:  ");
        inputGPA = key.nextFloat();
        
        // Input a second new student
        System.out.println("Let's try another student!");
        Student anotherStudent = inputStudentData();
        
        // Initialize a student with the given data
        newStudent.setStudent(inputName, inputId, inputDepartment, inputGPA);
        
        // Print both students' information
        newStudent.printStudentInfo();
        anotherStudent.printStudentInfo();
        
        // Print out first student's information
        System.out.println();
        System.out.println("Here's the student's information.");
        System.out.println("Name:  " + newStudent.getName());
        System.out.println("ID:  "  + newStudent.getId());
        System.out.println("Department:  " + newStudent.getDepartment());
        System.out.println("GPA:  " + newStudent.getGPA());
    }
}
