package org.howard.edu.lspfinal.question3;

/**
 * Abstract class defining the template method for generating a report.
 */
public abstract class Report {

    /**
     * Template method that defines the workflow for generating a report.
     */
    public final void generateReport() {
        loadData();
        formatData();
        printReport();
    }

    protected abstract void loadData();
    protected abstract void formatData();
    protected abstract void printReport();
}
