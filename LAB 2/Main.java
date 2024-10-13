import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    int grade;

    // Method to calculate grade based on marks
    public void calculateGrade() {
        if (subjectMarks >= 90) {
            grade = 10; // O grade
        } else if (subjectMarks >= 80) {
            grade = 9; // A grade
        } else if (subjectMarks >= 70) {
            grade = 8; // B grade
        } else if (subjectMarks >= 60) {
            grade = 7; // C grade
        } else if (subjectMarks >= 50) {
            grade = 6; // D grade
        } else if (subjectMarks >= 40) {
            grade = 5; // E grade
        } else {
            grade = 0; // F grade (fail)
        }
    }
}

class Student {
    String name;
    String usn;
    double SGPA;
    Subject subject[];
    Scanner s;

    // Constructor
    Student() {
        int i;
        subject = new Subject[8]; // Assuming there are 8 subjects
        for (i = 0; i < 8; i++) {
            subject[i] = new Subject(); // create array of n objects
        }
        s = new Scanner(System.in);
    }

    // Method to read student details
    public void getStudentDetails() {
        System.out.print("Enter student name: ");
        name = s.nextLine();
        System.out.print("Enter student USN: ");
        usn = s.nextLine();
    }

    // Method to read marks and credits
    public void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subject[i].subjectMarks = s.nextInt();
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            subject[i].credits = s.nextInt();
            subject[i].calculateGrade(); // Calculate grade for the subject

            // Validate marks
            if (subject[i].subjectMarks > 100) {
                System.out.println("Invalid marks, should not exceed 100.");
                subject[i].subjectMarks = 0; // Set to 0 or handle as necessary
            } else if (subject[i].subjectMarks < 0) {
                System.out.println("Invalid marks, should not be negative.");
                subject[i].subjectMarks = 0; // Set to 0 or handle as necessary
            }
        }
    }

    // Method to compute SGPA
    public void computeSGPA() {
        double totalGradePoints = 0;
        int totalCredits = 0;

        for (Subject subj : subject) {
            totalGradePoints += (subj.grade * subj.credits);
            totalCredits += subj.credits;
        }

        if (totalCredits > 0) {
            SGPA = totalGradePoints / totalCredits;
        } else {
            SGPA = 0.0;
        }
    }

    // Method to display student details and SGPA
    public void displayResults() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.printf("SGPA: %.2f%n", SGPA);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getStudentDetails();
        s1.getMarks();
        s1.computeSGPA();
        s1.displayResults();
    }
}