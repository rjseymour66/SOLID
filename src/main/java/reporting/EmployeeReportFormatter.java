package reporting;

import domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
    private Employee anEmployee;
    private FormatType formatType;

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee() {

        return getFormattedValue();
    }
}
