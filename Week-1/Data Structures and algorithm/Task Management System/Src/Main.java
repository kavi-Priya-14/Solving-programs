package tasklist;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask(new Task("T001", "Design Database", "Pending"));
        taskList.addTask(new Task("T002", "Write API", "In Progress"));
        taskList.addTask(new Task("T003", "Testing", "Pending"));

        System.out.println("=== All Tasks ===");
        taskList.listTasks();

        System.out.println("\n=== Search Task T002 ===");
        Task task = taskList.searchTask("T002");
        System.out.println(task != null ? task : "Task not found");

        System.out.println("\n=== Delete Task T002 ===");
        taskList.deleteTask("T002");

        System.out.println("\n=== All Tasks After Deletion ===");
        taskList.listTasks();
    }
}
