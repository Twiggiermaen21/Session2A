package employee;

public class Employee {

    public float calculateGrossPayroll(EmployeeType type, float monthSales, float overtimeHours) {
        float baseSalary = 0;

        // Base salary by type
        if (type == EmployeeType.SALESPERSON) {
            baseSalary = 2000;
        } else if (type == EmployeeType.MANAGER) {
            baseSalary = 2500;
        }

        // Bonus by sales
        float bonus = 0;
        if (monthSales >= 1500) {
            bonus = 200;
        } else if (monthSales >= 1000) {
            bonus = 100;
        }

        // Overtime pay (€30/hour)
        float overtimePay = overtimeHours * 30;

        // Total gross
        return baseSalary + bonus + overtimePay;
    }

    public float calculateNetPayroll(float grossPayroll) {
        float withholding = 0;

        if (grossPayroll < 2100) {
            withholding = 0;
        } else if (grossPayroll < 2500) {
            withholding = 0.15f;
        } else {
            withholding = 0.18f;
        }

        return grossPayroll * (1 - withholding);
    }
}
