package EX5;

import java.util.Scanner;

class LLNode {
    Task task;
    LLNode nextNode;

    LLNode(Task task) {
        this.task = task;
        this.nextNode = null;
    }
}

class Task {
    int taskid;
    String taskname;
    String taskStatus;

    Task(int taskid, String taskname, String taskStatus) {
        this.taskid = taskid;
        this.taskname = taskname;
        this.taskStatus = taskStatus;
    }
}

public class Task_manager {
    // Java is not call by refference so send back the root to update
    public static LLNode addTask(LLNode root, Task task) {
        LLNode newNode = new LLNode(task);
        if (root == null) {
            System.out.println("Root is null, creating new root node.");
            return newNode;
        }
        LLNode temp = root;
        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }
        temp.nextNode = newNode;
        System.out.println("Node was added successfully!");
        return root;
    }

    public static void searchTask(LLNode root, int taskd) {
        LLNode temp = root;
        if (root == null) {
            System.out.println("No element to search from.");
            return;
        }

        while (temp != null && temp.task.taskid != taskd) {
            temp = temp.nextNode;
        }

        if (temp == null) {
            System.out.println("The task with ID:" + taskd + " Doesn't exist");
            return;
        }
        System.out.println("Task found: ID: " + temp.task.taskid + ", Name: " + temp.task.taskname + ", Status: "
                + temp.task.taskStatus);
    }

    public static void traverseTask(LLNode root) {
        if (root == null) {
            System.out.println("No tasks to display.");
            return;
        }
        LLNode temp = root;
        while (temp != null) {
            System.out.println("Task ID: " + temp.task.taskid + ", Name: " + temp.task.taskname + ", Status: "
                    + temp.task.taskStatus);
            temp = temp.nextNode;
        }
    }

    public static LLNode deleteTask(LLNode root, int taskid) {
        if (root == null) {
            System.out.println("No tasks to delete.");
            return root;
        }
        LLNode temp = root;
        LLNode prev = null;
        while (temp != null && temp.task.taskid != taskid) {
            prev = temp;
            temp = temp.nextNode;
        }
        if (temp == null) {
            System.out.println("Task with ID: " + taskid + " not found.");
            return root;
        }
        if (prev == null) {
            System.out.println("Task with ID: " + taskid + " deleted successfully.");
            return temp.nextNode; // Return the new root
        }

        prev.nextNode = temp.nextNode;
        System.out.println("Task with ID: " + taskid + " deleted successfully.");
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task Manager Application");
        System.out
                .println("Enter your choise: \n1. Add Task\n2. Search Task\n3. Traverse Task\n4. Delete Task\n5. Exit");
        int choice = sc.nextInt();
        LLNode root = new LLNode(null);
        while (true) {
            switch (choice) {
                case 1:
                    System.out.println("Enter Task ID:");
                    int id = sc.nextInt();
                    System.out.println("Enter Task Name:");
                    String name = sc.next();
                    System.out.println("Enter Task Status (e.g., Pending, Completed,OnGoing):");
                    String status = sc.next();
                    Task newTask = new Task(id, name, status);
                    root = addTask(root, newTask);
                    break;
                case 2:
                    int taskid;
                    System.out.println("Enter Task ID to search:");
                    taskid = sc.nextInt();
                    searchTask(root, taskid);
                    break;
                case 3:
                    traverseTask(root);
                    break;
                case 4:
                    System.out.println("Enter Task ID to delete:");
                    taskid = sc.nextInt();
                    root = deleteTask(root, taskid);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
