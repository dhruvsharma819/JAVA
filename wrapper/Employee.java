//2. Develop an Employee Payroll System that accepts employee IDs, basic salary, and bonus amounts from the user. Convert the entered values into wrapper objects and perform validation operations to ensure valid salary values before calculating the net salary. 

import java.util.Scanner;

public class Employee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee's ID");
        String empId = sc.nextLine();

        System.out.println("Enter employee's Salary");
        String empSal = sc.nextLine();

        System.out.println("Enter employee's Bonous amount");
        String empBon = sc.nextLine();

        Integer id = Integer.valueOf(empId);
        Double sal = Double.valueOf(empSal);
        Double bonus = Double.valueOf(empBon);

        if (sal < 0 || bonus< 0) {
            System.out.println("Invalid salary or bonus amount.");
            return;
        } 
        
        double netSalary = sal + bonus;
            

        System.out.println("Employee Details");
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + sal);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
}
}