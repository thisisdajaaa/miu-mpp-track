package lesson10.prob1.javapackage;

import lesson10.prob1.bugreporter.BugReport;

@BugReport(assignedTo="Tom Jones", severity=1, reportedBy="Corazza")
public interface ClosedCurve {
	public double computePerimeter();
}
