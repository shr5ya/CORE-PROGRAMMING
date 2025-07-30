import java.util.*;

public class ZaraBonusCalculator {

    public static int[][] generateEmployeeData(int count) {
        int[][] data = new int[count][2];
        for (int i = 0; i < count; i++) {
            int salary = 10000 + (int)(Math.random() * 90000);
            int years = 1 + (int)(Math.random() * 10);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            updatedData[i][0] = bonus;
            updatedData[i][1] = newSalary;
        }
        return updatedData;
    }

    public static void displaySummary(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-10s %-15s %-15s %-15s%n", "Employee", "Years", "Old Salary", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = updatedData[i][0];
            double newSalary = updatedData[i][1];

            System.out.printf("%-10d %-10d %-15d %-15.2f %-15.2f%n", (i + 1), years, salary, bonus, newSalary);

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("Total      %-10s %-15.2f %-15.2f %-15.2f%n", "", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, updatedData);
    }
}
