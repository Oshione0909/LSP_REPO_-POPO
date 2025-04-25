package org.howard.edu.lspfinal.question2;

import java.util.*;

/**
 * Manages tasks including adding, retrieving, updating status, and grouping by status.
 */
public class TaskManager {
    private Map<String, Task> tasks = new HashMap<>();

    /**
     * Adds a new task to the manager.
     * @throws DuplicateTaskException if task with same name exists
     */
    public void addTask(String name, int priority, String status) throws DuplicateTaskException {
        if (tasks.containsKey(name)) {
            throw new DuplicateTaskException("Task '" + name + "' already exists.");
        }
        tasks.put(name, new Task(name, priority, status));
    }

    /**
     * Retrieves a task by name.
     * @throws TaskNotFoundException if task is not found
     */
    public Task getTaskByName(String name) throws TaskNotFoundException {
        if (!tasks.containsKey(name)) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        return tasks.get(name);
    }

    /**
     * Updates the status of a task.
     * @throws TaskNotFoundException if task is not found
     */
    public void updateStatus(String name, String status) throws TaskNotFoundException {
        Task task = getTaskByName(name); // reuses exception handling
        task.setStatus(status);
    }

    /**
     * Prints all tasks grouped by their status.
     */
    public void printTasksGroupedByStatus() {
        System.out.println("Tasks grouped by status:");
        Map<String, List<Task>> grouped = new HashMap<>();

        for (Task task : tasks.values()) {
        	grouped.computeIfAbsent(task.getStatus(), status -> new ArrayList<>()).add(task);
        }

        for (String status : Arrays.asList("TODO", "IN_PROGRESS", "DONE")) {
            System.out.println(status + ":");
            List<Task> list = grouped.getOrDefault(status, new ArrayList<>());
            for (Task task : list) {
                System.out.println("  " + task);
            }
        }
    }
}
