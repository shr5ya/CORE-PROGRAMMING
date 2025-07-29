import java.util.Scanner;

public class EmpBonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10], bonus = new double[10], newSalary = new double[10];
        double[] years = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary and years of service for employee " + (i+1) + ": ");
            double s = sc.nextDouble(), y = sc.nextDouble();
            if (s <= 0 || y < 0) { i--; continue; }
            salary[i] = s; years[i] = y;
        }
        for (int i = 0; i < 10; i++) {
            bonus[i] = salary[i] * (years[i] > 5 ? 0.05 : 0.02);
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i]; totalOld += salary[i]; totalNew += newSalary[i];
        }
        System.out.printf("Total Bonus: %.2f\nTotal Old Salary: %.2f\nTotal New Salary: %.2f\n",
                totalBonus, totalOld, totalNew);
        sc.close();
    }
}
