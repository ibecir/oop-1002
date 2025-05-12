package week11.labs.task2;

public class ProjectTasks {

    @TrackTask(assignedTo = "Bob", priority = 2)
    public void optimizeMemory() {
        System.out.println("Optimizing memory usage...");
    }

    @TrackTask(assignedTo = "Alice", priority = 3)
    public void fixCriticalBug() {
        System.out.println("Fixing a critical bug...");
    }

    @TrackTask(assignedTo = "Charlie")
    public void documentCode() {
        System.out.println("Documenting the project...");
    }
}
