class EmpDetail {
    String name = "Ram";
    int salary = 10000;

    void displayDetail() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends EmpDetail {
    void displayManager() {
        System.out.println("Manager accessing Employee details:");
        System.out.println("Employee Name: " + super.name);
        System.out.println("Salary: " + super.salary);
    }
}

public class Employee {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displayManager();
    }
}