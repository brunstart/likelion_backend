package day14_250905.SRPRefactoring;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 50000);

        CalculatePay cal = new CalculatePay();
        double pay = cal.calculatePay(emp1);

        SaveToDatabase save = new SaveToDatabase();
        save.saveDB(emp1);

        GenerateReport gen = new GenerateReport();
        System.out.println(gen.generateReport(emp1));
    }
}
