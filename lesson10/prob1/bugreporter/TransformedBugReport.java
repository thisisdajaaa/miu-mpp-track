package lesson10.prob1.bugreporter;

public class TransformedBugReport {
    private String reportedBy;
    private String assignedTo;
    private int severity;
    private String description;
    private String className;

    public TransformedBugReport(String assignedTo, String reportedBy, int severity, String description, String className) {
        this.assignedTo = assignedTo;
        this.reportedBy = reportedBy;
        this.severity = severity;
        this.description = description;
        this.className = className;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
