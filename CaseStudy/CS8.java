class Employee {
    String name;
    float basesalary;

    public Employee(String name, float basesalary) {
        this.name = name;
        this.basesalary = basesalary;
    }

    public float Cal_salary() {
        return basesalary + (basesalary * 0.05f); 
    }

    public String Get_name() {
        return name;
    }
}

class Manager extends Employee {
    public Manager(String name, float basesalary) {
        super(name, basesalary);
    }

    public float Cal_salary() {
        return super.Cal_salary() + 2000;
    }

    public float Get_emp_sal() {
        return super.basesalary;
    }
}

class Executive extends Manager {
    public Executive(String name, float basesalary) {
        super(name, basesalary);
    }

    public float Cal_salary() {
        return super.Cal_salary() + (super.Get_emp_sal() * 0.10f); 
    }
}

public class CS8 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 10000);
        System.out.println(emp.Get_name() + " Total salary: " + emp.Cal_salary());

        Manager man = new Manager("Bob", 10000);
        System.out.println(man.Get_name() + " Total salary: " + man.Cal_salary());

        Employee exec = new Executive("Charlie", 10000);
        System.out.println(exec.Get_name() + " Total salary: " + exec.Cal_salary());
    }
}