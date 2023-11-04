import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    private static ArrayList<AddTask> tasks = new ArrayList<>();
    private  static int taskIdCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
        System.out.println("Welcome to the tasks management system");

        System.out.println("Select options:");
        System.out.println("1. Add a new task");
        System.out.println("2. Remove a task");
        System.out.println("3. View all taks");
        System.out.println("5. Exit");

        int option = scanner.nextInt();
        scanner.nextLine();


            switch (option){
                case 1:
                    System.out.println("Enter the task name");
                    String nameTask = scanner.nextLine();

                    System.out.println("Enter a description of the task");
                    String descriptionTask = scanner.nextLine();

                    System.out.println("Enter the deadline to finish (example: 2023-11-11)");
                    String deadlineTask = scanner.nextLine();
                    AddTask Task = new AddTask(nameTask,descriptionTask,deadlineTask);
                    tasks.add(Task);
                    System.out.println("Task has been added");
                    break;

                case 2:
                    System.out.println("Enter the number task to remove");
                    int taskNumber = scanner.nextInt();
                    if(removeTask(taskNumber)){
                        System.out.println("Task has been remove");
                    }else {
                        System.out.println("The task with the given number does not exist");
                    }
                    break;

                case 3:
                    listTasks();
                    break;

                case 4:
                    scanner.close();
                    System.exit(0);
            }
        }
    }
    private static boolean removeTask(int taskIdCounter){
        for (int i = 0; i < tasks.size(); i++) {
            if(i + 1 == taskIdCounter){
                tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    private static void listTasks(){
        if(tasks.isEmpty()){
            System.out.println("No taks on the list");
        }else {
            System.out.println("Task list");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("Task #" + (i + 1));
                System.out.println(tasks.get(i));
                System.out.println();
            }
        }
    }
}