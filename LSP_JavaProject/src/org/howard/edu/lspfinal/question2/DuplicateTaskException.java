package org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when a duplicate task is added to the task manager.
 */
public class DuplicateTaskException extends Exception {
    private static final long serialVersionUID = 1L;

    public DuplicateTaskException(String message) {
        super(message);
    }
}
