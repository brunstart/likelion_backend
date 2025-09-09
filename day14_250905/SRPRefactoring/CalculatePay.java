package day14_250905.SRPRefactoring;

public class CalculatePay {
    public double calculatePay(Employee employee) {
        double baseSalary = employee.getSalary();
        double bonus = baseSalary * 0.1;
        return baseSalary + bonus;
    }
}
