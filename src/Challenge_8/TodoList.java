package Challenge_8;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static ArrayList<String> todoList() {

        ArrayList<String> taskList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Show List");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    System.out.print("Enter the new task: ");
                    String newItem = scanner.next();
                    taskList.add(newItem);
                    System.out.println("Task added successfully!");
                    break;

                case "2":
                    if (!taskList.isEmpty()) {
                        System.out.println("\nTask list:");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println(i + ": " + taskList.get(i));
                        }

                        System.out.print("\nTask to remove: ");
                        int taskToRemove = scanner.nextInt();

                        if (taskToRemove >= 0 && taskToRemove < taskList.size()) {
                            taskList.remove(taskToRemove);
                            System.out.println("\nThe task has been removed.");
                        } else {
                            System.out.println("\nInvalid task.");
                        }
                    } else {
                        System.out.println("\nEmpty list.");
                    }
                    break;

                case "3":
                    if (!taskList.isEmpty()) {
                        System.out.println("\nTask list:");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println(i + ": " + taskList.get(i));
                        }
                    } else {
                        System.out.println("\nEmpty list.");
                    }
                    break;

                case "4":
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose again.");

            }
        }
    }
}