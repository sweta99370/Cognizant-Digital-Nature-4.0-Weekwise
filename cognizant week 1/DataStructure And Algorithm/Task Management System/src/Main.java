public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Design Module", "Pending"));
        manager.addTask(new Task(2, "Implement API", "In Progress"));
        manager.addTask(new Task(3, "Test Code", "Pending"));

        System.out.println("\nAll Tasks:");
        manager.traverseTasks();

        System.out.println("\nSearching for Task ID 2:");
        Task found = manager.searchTask(2);
        System.out.println(found != null ? found : "Not Found");

        System.out.println("\nDeleting Task ID 1:");
        manager.deleteTask(1);

        System.out.println("\nAll Tasks After Deletion:");
        manager.traverseTasks();
    }
}
