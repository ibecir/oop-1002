package week11.labs.task2;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        ProjectTasks tasks = new ProjectTasks();
        Method[] methods = tasks.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(TrackTask.class)) {
                TrackTask annotation = method.getAnnotation(TrackTask.class);
                String assignedTo = annotation.assignedTo();
                int priority = annotation.priority();

                String priorityStr = switch (priority) {
                    case 3 -> "HIGH";
                    case 2 -> "MEDIUM";
                    default -> "LOW";
                };

                System.out.println("Method: " + method.getName());
                System.out.println("Assigned To: " + assignedTo);
                System.out.println("Priority: " + priorityStr);
                System.out.println();

                if (priority == 3 &&
                        !(method.getName().toLowerCase().contains("critical") ||
                                method.getName().toLowerCase().contains("important"))) {
                    System.out.println("Warning: Method " + method.getName() +
                            " has high priority but is not labeled as 'Critical' or 'Important'");
                    System.out.println();
                }
            }
        }
    }
}
