package EX4;
import java.util.Scanner;
class Employee{
     int EmployeeID;
     String EmployeeName;
     String EmployeePosition;
     int EmployeeSalary;

     Employee(int EmployeeID, String EmployeeName, String EmployeePosition, int EmployeeSalary){
          this.EmployeeID = EmployeeID;
          this.EmployeeName = EmployeeName;
          this.EmployeePosition = EmployeePosition;
          this.EmployeeSalary = EmployeeSalary;
     }
}

public class EmployeeManagementSystem {
     public static void addEmployee(Employee[] employee){
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter Employee ID: ");
          int id = sc.nextInt();
          sc.nextLine(); // Consume newline 
          System.out.print("Enter Employee Name: ");
          String name = sc.nextLine();
          System.out.print("Enter Employee Position: ");
          String position = sc.nextLine();
          System.out.print("Enter Employee Salary: ");
          int salary = sc.nextInt();
          employee[employee.length-1]=new Employee(id, name, position, salary);
          System.out.println("Employee added successfully!");
          sc.close();
     }
     public static boolean searchEmployee(Employee[] employee, int employeeid){
          if(employee == null || employee.length == 0) {
               System.out.println("No employees to delete.");
               return false;
          }
          boolean found = false;
          for(int i=0;i<employee.length;i++){
               if(employee[i].EmployeeID == employeeid){
                    found = true;
                    break;
               }
          }
          return found;
     }
     public static void traverseEmployeeArray(Employee[] employee){
          if(employee == null || employee.length == 0) {
               System.out.println("No employees to delete.");
               return;
          }

          System.out.println("Entries in employee table:");
          for(int i=0;i<employee.length;i++){
               System.out.print("\tEmployee ID: " + employee[i].EmployeeID);
               System.out.print("\tEmployee Name: " + employee[i].EmployeeName);         
               System.out.print("\tEmployee Position: " + employee[i].EmployeePosition);
               System.out.print("\tEmployee Salary: " + employee[i].EmployeeSalary);
               System.out.println();
          }
     }
     public static void deleteEmployee(Employee[] employee,int employeeId){
          if(employee == null || employee.length == 0) {
               System.out.println("No employees to delete.");
               return;
          }
          
          for(int i=0;i<employee.length;i++){
               if(employee[i].EmployeeID == employeeId){
                    //shiftnig all indices to the left
                    for(int j=i;j<employee.length-1;j++) employee[j]=employee[j+1];
               }
          }
     }
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the number of employees:");
          int EmployeeCount=sc.nextInt();
          System.out.println("Enter the employee details one by one:");
          Employee[] employee = new Employee[EmployeeCount];
          
          System.out.println("enter you'r choice:\n1.Add Employee\n2.Search Employee\n3.Traverse Employee Array\n4.Delete Employee\n5.Exit");
          int choice = sc.nextInt();
          while (true) {
               switch (choice) {
                    case 1:
                         addEmployee(employee);
                         break;
                    case 2:
                         System.out.print("Enter Employee ID to search: ");
                         int searchId = sc.nextInt();
                         boolean found=searchEmployee(employee,searchId);
                         if(found) System.out.println("Employee with ID " + searchId + " found.");
                         else System.out.println("Employee with ID " + searchId + " not found.");
                         break;
                    case 3:
                         traverseEmployeeArray(employee);
                         break;
                    case 4:
                         System.out.println("Enter the Employee ID to delete:");
                         int employeeId = sc.nextInt();
                         deleteEmployee(employee, employeeId);
                         break;
                    case 5:
                         System.out.println("Exiting the Employee Management System.");
                         sc.close();
                         return;
                    default:
                         System.out.println("Invalid choice. Please try again.");
               }
          }
     }
}
