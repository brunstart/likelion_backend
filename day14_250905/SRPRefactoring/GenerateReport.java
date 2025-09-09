package day14_250905.SRPRefactoring;

public class GenerateReport {
    public String generateReport(Employee employee) {
        return "Employee name : " + employee.getName() +
                ", Salary : " + employee.getSalary() + "\n";
    }
}
