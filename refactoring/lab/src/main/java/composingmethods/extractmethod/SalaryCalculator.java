package composingmethods.extractmethod;

public class SalaryCalculator {

    public double calculateSalaryWithoutTax(Employee employee) {
        double baseSalary = employee.getBaseSalary();
        int overtimeHours = employee.getOvertimeHours();
        double bonusPercentage = employee.getBonusPercentage();
        double totalSalary = baseSalary;
        if (overtimeHours > 0) {
            double overtimePay = overtimeHours * baseSalary * 1.5;
            totalSalary += overtimePay;
        }
        double bonus = baseSalary * bonusPercentage / 100;

        totalSalary += bonus;

        return totalSalary;

    }

    public double calculateTax(double taxRate, double totalSalary) {
        return totalSalary * taxRate / 100;
    }

    public double calculateSalaryWithTax(Employee employee){
        double totalSalary = calculateSalaryWithoutTax(employee);
        return totalSalary - calculateTax(employee.getTaxRate(), totalSalary);
    }
}

