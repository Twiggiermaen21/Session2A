package test;

import org.junit.jupiter.api.Test;

import employee.Employee;
import employee.EmployeeType;

public class EmployeeTest {

	@Test
    public void employeeTest() {

        Employee emp = new Employee();

        System.out.println("=== GROSS PAY TESTS ===");

        System.out.println("1️⃣ SALESPERSON, 999€, 0h => " +
            emp.calculateGrossPayroll(EmployeeType.SALESPERSON, 999, 0));

        System.out.println("2️⃣ SALESPERSON, 1000€, 0h => " +
            emp.calculateGrossPayroll(EmployeeType.SALESPERSON, 1000, 0));

        System.out.println("3️⃣ SALESPERSON, 1500€, 0h => " +
            emp.calculateGrossPayroll(EmployeeType.SALESPERSON, 1500, 0));

        System.out.println("4️⃣ MANAGER, 1499€, 2h => " +
            emp.calculateGrossPayroll(EmployeeType.MANAGER, 1499, 2));

        System.out.println("5️⃣ MANAGER, 1500€, 0h => " +
            emp.calculateGrossPayroll(EmployeeType.MANAGER, 1500, 0));

        System.out.println("\n=== NET PAY TESTS ===");

        System.out.println("6️⃣ Gross 2000€ => Net: " +
            emp.calculateNetPayroll(2000));

        System.out.println("7️⃣ Gross 2100€ => Net: " +
            emp.calculateNetPayroll(2100));

        System.out.println("8️⃣ Gross 2499€ => Net: " +
            emp.calculateNetPayroll(2499));

        System.out.println("9️⃣ Gross 2500€ => Net: " +
            emp.calculateNetPayroll(2500));

        System.out.println("\n✅ TESTS FINISHED ✅");
    }
}
