package Design_Patterns.MVCPatternExample;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create initial model and view
        Student student = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        System.out.println("=== Student Record Management ===");

        // Input from user
        System.out.print("Enter student name: ");
        controller.setStudentName(scanner.nextLine());

        System.out.print("Enter student ID: ");
        controller.setStudentId(scanner.nextLine());

        System.out.print("Enter student grade: ");
        controller.setStudentGrade(scanner.nextLine());

        // Display student details
        controller.updateView();

        // Optionally allow update
        System.out.print("\nDo you want to update the student grade? (yes/no): ");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("yes")) {
            System.out.print("Enter new grade: ");
            controller.setStudentGrade(scanner.nextLine());
            controller.updateView();
        }

        System.out.println("Program ended.");
        scanner.close();
    }
}
