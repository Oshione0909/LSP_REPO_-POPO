package org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when a task is not found in the task manager.
 */
public class TaskNotFoundException extends Exception {
	 private static final long serialVersionUID = 1L;
	
    public TaskNotFoundException(String message) {
        super(message);
    }
}
