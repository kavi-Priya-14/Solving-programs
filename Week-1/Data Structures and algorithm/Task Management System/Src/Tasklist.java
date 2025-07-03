package tasklist;

public class TaskList {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTask(String taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void deleteTask(String taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            System.out.println("Task " + taskId + " deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId().equals(taskId)) {
                current.next = current.next.next;
                System.out.println("Task " + taskId + " deleted.");
                return;
            }
            current = current.next;
        }

        System.out.println("Task not found.");
    }

    public void listTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}
